package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DepartmentsApi struct {
    client *sdkhttp.Client
}

func NewDepartmentsApi(client *sdkhttp.Client) *DepartmentsApi {
    return &DepartmentsApi{client: client}
}

// 获取组织的部门列表
func (a *DepartmentsApi) GetDepartmentsByOrg(orgId string) (sdktypes.PlusApiResultListDepartmentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/departments", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentVO](raw)
}

// 获取部门树
func (a *DepartmentsApi) GetDepartmentTree(orgId string) (sdktypes.PlusApiResultListDepartmentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/departments/tree", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentDetailVO](raw)
}
