package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ShareApi(private val client: HttpClient) {

    /** 更新分享设置 */
    suspend fun updateShareSettings(shareId: String, body: ShareUpdateForm): PlusApiResultShareRecordVO? {
        return client.put(ApiPaths.appPath("/share/$shareId"), body) as? PlusApiResultShareRecordVO
    }

    /** 取消分享 */
    suspend fun cancel(shareId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/share/$shareId")) as? PlusApiResultVoid
    }

    /** 创建分享 */
    suspend fun createShare(body: ShareCreateForm): PlusApiResultShareCreateVO? {
        return client.post(ApiPaths.appPath("/share"), body) as? PlusApiResultShareCreateVO
    }

    /** 访问分享 */
    suspend fun visit(shareCode: String, body: ShareVisitForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/share/$shareCode/visit"), body) as? PlusApiResultVoid
    }

    /** 验证分享密码 */
    suspend fun verifySharePassword(shareCode: String, body: ShareVerifyForm): PlusApiResultShareVerifyVO? {
        return client.post(ApiPaths.appPath("/share/$shareCode/verify"), body) as? PlusApiResultShareVerifyVO
    }

    /** 上报分享 */
    suspend fun track(body: ShareTrackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/share/track"), body) as? PlusApiResultVoid
    }

    /** 生成分享海报 */
    suspend fun generateSharePoster(body: SharePosterForm): PlusApiResultSharePosterVO? {
        return client.post(ApiPaths.appPath("/share/poster"), body) as? PlusApiResultSharePosterVO
    }

    /** 领取邀请奖励 */
    suspend fun claimInviteReward(rewardId: String): PlusApiResultInviteRewardClaimVO? {
        return client.post(ApiPaths.appPath("/share/invite/rewards/$rewardId/claim"), null) as? PlusApiResultInviteRewardClaimVO
    }

    /** 生成邀请链接 */
    suspend fun generateInviteLink(body: InviteLinkForm): PlusApiResultInviteLinkVO? {
        return client.post(ApiPaths.appPath("/share/invite/link"), body) as? PlusApiResultInviteLinkVO
    }

    /** 获取访问记录 */
    suspend fun getShareVisitors(shareId: String, params: Map<String, Any>? = null): PlusApiResultPageShareVisitorVO? {
        return client.get(ApiPaths.appPath("/share/$shareId/visitors"), params) as? PlusApiResultPageShareVisitorVO
    }

    /** 获取分享统计 */
    suspend fun getShareStatistics(shareId: String): PlusApiResultShareStatisticsVO? {
        return client.get(ApiPaths.appPath("/share/$shareId/statistics")) as? PlusApiResultShareStatisticsVO
    }

    /** 获取分享信息 */
    suspend fun getShareInfo(shareCode: String, params: Map<String, Any>? = null): PlusApiResultShareInfoVO? {
        return client.get(ApiPaths.appPath("/share/$shareCode"), params) as? PlusApiResultShareInfoVO
    }

    /** 获取分享平台配置 */
    suspend fun getSharePlatforms(): PlusApiResultListSharePlatformVO? {
        return client.get(ApiPaths.appPath("/share/platforms")) as? PlusApiResultListSharePlatformVO
    }

    /** 获取我的分享 */
    suspend fun listMyShares(params: Map<String, Any>? = null): PlusApiResultPageShareRecordVO? {
        return client.get(ApiPaths.appPath("/share/my-shares"), params) as? PlusApiResultPageShareRecordVO
    }

    /** 获取邀请记录 */
    suspend fun getInviteRecords(params: Map<String, Any>? = null): PlusApiResultPageInviteRecordVO? {
        return client.get(ApiPaths.appPath("/share/invite/records"), params) as? PlusApiResultPageInviteRecordVO
    }

    /** 获取邀请信息 */
    suspend fun getInviteInfo(): PlusApiResultInviteInfoVO? {
        return client.get(ApiPaths.appPath("/share/invite/info")) as? PlusApiResultInviteInfoVO
    }

    /** 批量取消分享 */
    suspend fun batchCancelShares(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/share/batch")) as? PlusApiResultVoid
    }
}
