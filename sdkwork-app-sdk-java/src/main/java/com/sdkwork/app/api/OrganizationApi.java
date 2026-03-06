package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class OrganizationApi {
    private final HttpClient client;
    
    public OrganizationApi(HttpClient client) {
        this.client = client;
    }

    /** 创建组织 */
    public PlusApiResultOrganizationVO createOrganization(OrganizationCreateForm body) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization"), body);
    }

    /** 禁用组织 */
    public PlusApiResultOrganizationVO disable(String orgId) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization/" + orgId + "/disable"), null);
    }

    /** 激活组织 */
    public PlusApiResultOrganizationVO activate(String orgId) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization/" + orgId + "/activate"), null);
    }

    /** 创建岗位 */
    public PlusApiResultPositionVO createPosition(PositionCreateForm body) throws Exception {
        return (PlusApiResultPositionVO) client.post(ApiPaths.appPath("/organization/position"), body);
    }

    /** 创建部门 */
    public PlusApiResultDepartmentVO createDepartment(DepartmentCreateForm body) throws Exception {
        return (PlusApiResultDepartmentVO) client.post(ApiPaths.appPath("/organization/department"), body);
    }

    /** 获取组织详情 */
    public PlusApiResultOrganizationDetailVO getOrganization(String orgId) throws Exception {
        return (PlusApiResultOrganizationDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + ""));
    }

    /** 获取组织的岗位列表 */
    public PlusApiResultListPositionVO getPositionsByOrg(String orgId) throws Exception {
        return (PlusApiResultListPositionVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/positions"));
    }

    /** 获取岗位树 */
    public PlusApiResultListPositionDetailVO getPositionTree(String orgId) throws Exception {
        return (PlusApiResultListPositionDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/positions/tree"));
    }

    /** 获取组织成员 */
    public PlusApiResultPageMemberVO getMembersByOrg(String orgId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMemberVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/members"), params);
    }

    /** 获取组织的部门列表 */
    public PlusApiResultListDepartmentVO getDepartmentsByOrg(String orgId) throws Exception {
        return (PlusApiResultListDepartmentVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/departments"));
    }

    /** 获取部门树 */
    public PlusApiResultListDepartmentDetailVO getDepartmentTree(String orgId) throws Exception {
        return (PlusApiResultListDepartmentDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/departments/tree"));
    }

    /** 获取子组织 */
    public PlusApiResultListOrganizationVO getChildOrganizations(String orgId) throws Exception {
        return (PlusApiResultListOrganizationVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/children"));
    }

    /** 获取组织统计 */
    public PlusApiResultOrganizationStatisticsVO getOrganizationStatistics() throws Exception {
        return (PlusApiResultOrganizationStatisticsVO) client.get(ApiPaths.appPath("/organization/statistics"));
    }

    /** 获取岗位详情 */
    public PlusApiResultPositionDetailVO getPosition(String posId) throws Exception {
        return (PlusApiResultPositionDetailVO) client.get(ApiPaths.appPath("/organization/position/" + posId + ""));
    }

    /** 获取子岗位 */
    public PlusApiResultListPositionVO getChildPositions(String posId) throws Exception {
        return (PlusApiResultListPositionVO) client.get(ApiPaths.appPath("/organization/position/" + posId + "/children"));
    }

    /** 获取成员详情 */
    public PlusApiResultMemberVO getMember(String memberId) throws Exception {
        return (PlusApiResultMemberVO) client.get(ApiPaths.appPath("/organization/member/" + memberId + ""));
    }

    /** 获取组织列表 */
    public PlusApiResultPageOrganizationVO getOrganizationList(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageOrganizationVO) client.get(ApiPaths.appPath("/organization/list"), params);
    }

    /** 获取部门详情 */
    public PlusApiResultDepartmentDetailVO getDepartment(String deptId) throws Exception {
        return (PlusApiResultDepartmentDetailVO) client.get(ApiPaths.appPath("/organization/department/" + deptId + ""));
    }

    /** 获取子部门 */
    public PlusApiResultListDepartmentVO getChildDepartments(String deptId) throws Exception {
        return (PlusApiResultListDepartmentVO) client.get(ApiPaths.appPath("/organization/department/" + deptId + "/children"));
    }

    /** 根据编码获取组织 */
    public PlusApiResultOrganizationDetailVO getOrganizationByCode(String code) throws Exception {
        return (PlusApiResultOrganizationDetailVO) client.get(ApiPaths.appPath("/organization/code/" + code + ""));
    }
}
