package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DepartmentsApi {
    private final HttpClient client;
    
    public DepartmentsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取组织的部门列表 */
    public PlusApiResultListDepartmentVO getDepartmentsByOrg(String orgId) throws Exception {
        return (PlusApiResultListDepartmentVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/departments"));
    }

    /** 获取部门树 */
    public PlusApiResultListDepartmentDetailVO getDepartmentTree(String orgId) throws Exception {
        return (PlusApiResultListDepartmentDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/departments/tree"));
    }
}
