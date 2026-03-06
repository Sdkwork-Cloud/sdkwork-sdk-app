package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type OrganizationApi struct {
    client *sdkhttp.Client
}

func NewOrganizationApi(client *sdkhttp.Client) *OrganizationApi {
    return &OrganizationApi{client: client}
}

// 创建组织
func (a *OrganizationApi) CreateOrganization(body sdktypes.OrganizationCreateForm) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}

// 禁用组织
func (a *OrganizationApi) Disable(orgId string) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/organization/%s/disable", orgId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}

// 激活组织
func (a *OrganizationApi) Activate(orgId string) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/organization/%s/activate", orgId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}

// 创建岗位
func (a *OrganizationApi) CreatePosition(body sdktypes.PositionCreateForm) (sdktypes.PlusApiResultPositionVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPositionVO](raw)
}

// 创建部门
func (a *OrganizationApi) CreateDepartment(body sdktypes.DepartmentCreateForm) (sdktypes.PlusApiResultDepartmentVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization/department"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDepartmentVO](raw)
}

// 获取组织详情
func (a *OrganizationApi) GetOrganization(orgId string) (sdktypes.PlusApiResultOrganizationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationDetailVO](raw)
}

// 获取组织的岗位列表
func (a *OrganizationApi) GetPositionsByOrg(orgId string) (sdktypes.PlusApiResultListPositionVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/positions", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionVO](raw)
}

// 获取岗位树
func (a *OrganizationApi) GetPositionTree(orgId string) (sdktypes.PlusApiResultListPositionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/positions/tree", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionDetailVO](raw)
}

// 获取组织成员
func (a *OrganizationApi) GetMembersByOrg(orgId string, query map[string]interface{}) (sdktypes.PlusApiResultPageMemberVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/members", orgId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMemberVO](raw)
}

// 获取组织的部门列表
func (a *OrganizationApi) GetDepartmentsByOrg(orgId string) (sdktypes.PlusApiResultListDepartmentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/departments", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentVO](raw)
}

// 获取部门树
func (a *OrganizationApi) GetDepartmentTree(orgId string) (sdktypes.PlusApiResultListDepartmentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/departments/tree", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentDetailVO](raw)
}

// 获取子组织
func (a *OrganizationApi) GetChildOrganizations(orgId string) (sdktypes.PlusApiResultListOrganizationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/children", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListOrganizationVO](raw)
}

// 获取组织统计
func (a *OrganizationApi) GetOrganizationStatistics() (sdktypes.PlusApiResultOrganizationStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/organization/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationStatisticsVO](raw)
}

// 获取岗位详情
func (a *OrganizationApi) GetPosition(posId string) (sdktypes.PlusApiResultPositionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/position/%s", posId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPositionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPositionDetailVO](raw)
}

// 获取子岗位
func (a *OrganizationApi) GetChildPositions(posId string) (sdktypes.PlusApiResultListPositionVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/position/%s/children", posId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionVO](raw)
}

// 获取成员详情
func (a *OrganizationApi) GetMember(memberId string) (sdktypes.PlusApiResultMemberVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/member/%s", memberId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMemberVO](raw)
}

// 获取组织列表
func (a *OrganizationApi) GetOrganizationList(query map[string]interface{}) (sdktypes.PlusApiResultPageOrganizationVO, error) {
    raw, err := a.client.Get(AppApiPath("/organization/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageOrganizationVO](raw)
}

// 获取部门详情
func (a *OrganizationApi) GetDepartment(deptId string) (sdktypes.PlusApiResultDepartmentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/department/%s", deptId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDepartmentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDepartmentDetailVO](raw)
}

// 获取子部门
func (a *OrganizationApi) GetChildDepartments(deptId string) (sdktypes.PlusApiResultListDepartmentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/department/%s/children", deptId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDepartmentVO](raw)
}

// 根据编码获取组织
func (a *OrganizationApi) GetOrganizationByCode(code string) (sdktypes.PlusApiResultOrganizationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationDetailVO](raw)
}
