package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PartnerApi(private val client: HttpClient) {

    /** 获取合作伙伴详情 */
    suspend fun getPartner(partnerId: String): PlusApiResultPartnerDetailVO? {
        return client.get(ApiPaths.appPath("/partner/$partnerId")) as? PlusApiResultPartnerDetailVO
    }

    /** 更新合作伙伴 */
    suspend fun updatePartner(partnerId: String, body: PartnerUpdateForm): PlusApiResultPartnerVO? {
        return client.put(ApiPaths.appPath("/partner/$partnerId"), body) as? PlusApiResultPartnerVO
    }

    /** 删除合作伙伴 */
    suspend fun deletePartner(partnerId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/partner/$partnerId")) as? PlusApiResultVoid
    }

    /** 申请成为合作伙伴 */
    suspend fun createPartner(body: PartnerCreateForm): PlusApiResultPartnerVO? {
        return client.post(ApiPaths.appPath("/partner"), body) as? PlusApiResultPartnerVO
    }

    /** 提现佣金 */
    suspend fun withdrawCommission(partnerId: String, body: CommissionForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/partner/$partnerId/withdraw"), body) as? PlusApiResultVoid
    }

    /** 审批拒绝 */
    suspend fun reject(partnerId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/partner/$partnerId/reject"), null) as? PlusApiResultVoid
    }

    /** 添加佣金 */
    suspend fun addCommission(partnerId: String, body: CommissionForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/partner/$partnerId/commission"), body) as? PlusApiResultVoid
    }

    /** 审批通过 */
    suspend fun approve(partnerId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/partner/$partnerId/approve"), null) as? PlusApiResultVoid
    }

    /** 获取下级合作伙伴 */
    suspend fun getSubordinates(partnerId: String, params: Map<String, Any>? = null): PlusApiResultPagePartnerVO? {
        return client.get(ApiPaths.appPath("/partner/subordinates/$partnerId"), params) as? PlusApiResultPagePartnerVO
    }

    /** 获取合作伙伴统计 */
    suspend fun getPartnerStatistics(): PlusApiResultPartnerStatisticsVO? {
        return client.get(ApiPaths.appPath("/partner/statistics")) as? PlusApiResultPartnerStatisticsVO
    }

    /** 搜索合作伙伴 */
    suspend fun searchPartners(params: Map<String, Any>? = null): PlusApiResultPagePartnerVO? {
        return client.get(ApiPaths.appPath("/partner/search"), params) as? PlusApiResultPagePartnerVO
    }

    /** 获取我的合作伙伴信息 */
    suspend fun getMy(): PlusApiResultPartnerDetailVO? {
        return client.get(ApiPaths.appPath("/partner/my")) as? PlusApiResultPartnerDetailVO
    }

    /** 根据推广码查询 */
    suspend fun getByPromotionCode(promotionCode: String): PlusApiResultPartnerVO? {
        return client.get(ApiPaths.appPath("/partner/code/$promotionCode")) as? PlusApiResultPartnerVO
    }
}
