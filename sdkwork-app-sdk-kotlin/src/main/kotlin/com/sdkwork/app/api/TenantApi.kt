package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class TenantApi(private val client: HttpClient) {

    /** 获取租户详情 */
    suspend fun getTenant(tenantId: String): PlusApiResultTenantDetailVO? {
        return client.get(ApiPaths.appPath("/tenant/$tenantId")) as? PlusApiResultTenantDetailVO
    }

    /** 更新租户 */
    suspend fun updateTenant(tenantId: String, body: TenantUpdateForm): PlusApiResultTenantVO? {
        return client.put(ApiPaths.appPath("/tenant/$tenantId"), body) as? PlusApiResultTenantVO
    }

    /** 创建租户 */
    suspend fun createTenant(body: TenantCreateForm): PlusApiResultTenantVO? {
        return client.post(ApiPaths.appPath("/tenant"), body) as? PlusApiResultTenantVO
    }

    /** 冻结租户 */
    suspend fun freeze(tenantId: String): PlusApiResultTenantVO? {
        return client.post(ApiPaths.appPath("/tenant/$tenantId/freeze"), null) as? PlusApiResultTenantVO
    }

    /** 注销租户 */
    suspend fun close(tenantId: String): PlusApiResultTenantVO? {
        return client.post(ApiPaths.appPath("/tenant/$tenantId/close"), null) as? PlusApiResultTenantVO
    }

    /** 激活租户 */
    suspend fun activate(tenantId: String): PlusApiResultTenantVO? {
        return client.post(ApiPaths.appPath("/tenant/$tenantId/activate"), null) as? PlusApiResultTenantVO
    }

    /** 获取租户类型列表 */
    suspend fun getTenantTypes(): PlusApiResultListTenantTypeVO? {
        return client.get(ApiPaths.appPath("/tenant/types")) as? PlusApiResultListTenantTypeVO
    }

    /** 获取租户统计 */
    suspend fun getTenantStatistics(): PlusApiResultTenantStatisticsVO? {
        return client.get(ApiPaths.appPath("/tenant/statistics")) as? PlusApiResultTenantStatisticsVO
    }

    /** 获取根租户 */
    suspend fun getRoot(): PlusApiResultTenantDetailVO? {
        return client.get(ApiPaths.appPath("/tenant/root")) as? PlusApiResultTenantDetailVO
    }

    /** 获取租户列表 */
    suspend fun getTenantList(params: Map<String, Any>? = null): PlusApiResultPageTenantVO? {
        return client.get(ApiPaths.appPath("/tenant/list"), params) as? PlusApiResultPageTenantVO
    }

    /** 根据编码获取租户 */
    suspend fun getTenantByCode(code: String): PlusApiResultTenantDetailVO? {
        return client.get(ApiPaths.appPath("/tenant/code/$code")) as? PlusApiResultTenantDetailVO
    }

    /** 获取云租户 */
    suspend fun getCloud(): PlusApiResultTenantDetailVO? {
        return client.get(ApiPaths.appPath("/tenant/cloud")) as? PlusApiResultTenantDetailVO
    }
}
