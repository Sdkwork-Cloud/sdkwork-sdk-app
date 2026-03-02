package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class TenantApi {
    private final HttpClient client;
    
    public TenantApi(HttpClient client) {
        this.client = client;
    }

    /** 获取租户详情 */
    public PlusApiResultTenantDetailVO getTenant(String tenantId) throws Exception {
        return (PlusApiResultTenantDetailVO) client.get(ApiPaths.appPath("/tenant/" + tenantId + ""));
    }

    /** 更新租户 */
    public PlusApiResultTenantVO updateTenant(String tenantId, TenantUpdateForm body) throws Exception {
        return (PlusApiResultTenantVO) client.put(ApiPaths.appPath("/tenant/" + tenantId + ""), body);
    }

    /** 创建租户 */
    public PlusApiResultTenantVO createTenant(TenantCreateForm body) throws Exception {
        return (PlusApiResultTenantVO) client.post(ApiPaths.appPath("/tenant"), body);
    }

    /** 冻结租户 */
    public PlusApiResultTenantVO freeze(String tenantId) throws Exception {
        return (PlusApiResultTenantVO) client.post(ApiPaths.appPath("/tenant/" + tenantId + "/freeze"), null);
    }

    /** 注销租户 */
    public PlusApiResultTenantVO close(String tenantId) throws Exception {
        return (PlusApiResultTenantVO) client.post(ApiPaths.appPath("/tenant/" + tenantId + "/close"), null);
    }

    /** 激活租户 */
    public PlusApiResultTenantVO activate(String tenantId) throws Exception {
        return (PlusApiResultTenantVO) client.post(ApiPaths.appPath("/tenant/" + tenantId + "/activate"), null);
    }

    /** 获取租户类型列表 */
    public PlusApiResultListTenantTypeVO getTenantTypes() throws Exception {
        return (PlusApiResultListTenantTypeVO) client.get(ApiPaths.appPath("/tenant/types"));
    }

    /** 获取租户统计 */
    public PlusApiResultTenantStatisticsVO getTenantStatistics() throws Exception {
        return (PlusApiResultTenantStatisticsVO) client.get(ApiPaths.appPath("/tenant/statistics"));
    }

    /** 获取根租户 */
    public PlusApiResultTenantDetailVO getRoot() throws Exception {
        return (PlusApiResultTenantDetailVO) client.get(ApiPaths.appPath("/tenant/root"));
    }

    /** 获取租户列表 */
    public PlusApiResultPageTenantVO getTenantList(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageTenantVO) client.get(ApiPaths.appPath("/tenant/list"), params);
    }

    /** 根据编码获取租户 */
    public PlusApiResultTenantDetailVO getTenantByCode(String code) throws Exception {
        return (PlusApiResultTenantDetailVO) client.get(ApiPaths.appPath("/tenant/code/" + code + ""));
    }

    /** 获取云租户 */
    public PlusApiResultTenantDetailVO getCloud() throws Exception {
        return (PlusApiResultTenantDetailVO) client.get(ApiPaths.appPath("/tenant/cloud"));
    }
}
