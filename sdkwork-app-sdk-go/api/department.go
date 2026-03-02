package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DepartmentApi struct {
    client *sdkhttp.Client
}

func NewDepartmentApi(client *sdkhttp.Client) *DepartmentApi {
    return &DepartmentApi{client: client}
}

// 创建部门
func (a *DepartmentApi) CreateDepartment(body sdktypes.DepartmentCreateForm) (sdktypes.PlusApiResultDepartmentVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization/department"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDepartmentVO](raw)
}

// 获取部门详情
func (a *DepartmentApi) GetDepartment(deptId string) (sdktypes.PlusApiResultDepartmentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/department/%s", deptId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDepartmentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDepartmentDetailVO](raw)
}

// 获取子部门
func (a *DepartmentApi) GetChildDepartments(deptId string) (sdktypes.PlusApiResultListDepartmentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/department/%s/children", deptId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentVO](raw)
}
