package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DepartmentApi {
    private final HttpClient client;
    
    public DepartmentApi(HttpClient client) {
        this.client = client;
    }

    /** 创建部门 */
    public PlusApiResultDepartmentVO createDepartment(DepartmentCreateForm body) throws Exception {
        return (PlusApiResultDepartmentVO) client.post(ApiPaths.appPath("/organization/department"), body);
    }

    /** 获取部门详情 */
    public PlusApiResultDepartmentDetailVO getDepartment(String deptId) throws Exception {
        return (PlusApiResultDepartmentDetailVO) client.get(ApiPaths.appPath("/organization/department/" + deptId + ""));
    }

    /** 获取子部门 */
    public PlusApiResultListDepartmentVO getChildDepartments(String deptId) throws Exception {
        return (PlusApiResultListDepartmentVO) client.get(ApiPaths.appPath("/organization/department/" + deptId + "/children"));
    }
}
