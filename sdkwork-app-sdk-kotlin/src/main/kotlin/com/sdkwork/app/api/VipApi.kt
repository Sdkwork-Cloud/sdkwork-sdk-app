package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VipApi(private val client: HttpClient) {

    /** 购买VIP */
    suspend fun purchase(body: VipPurchaseForm): PlusApiResultVipPurchaseVO? {
        return client.post(ApiPaths.appPath("/vip/purchase"), body) as? PlusApiResultVipPurchaseVO
    }

    /** 升级VIP */
    suspend fun upgrade(body: VipUpgradeForm): PlusApiResultVipPurchaseVO? {
        return client.post(ApiPaths.appPath("/vip/purchase/upgrade"), body) as? PlusApiResultVipPurchaseVO
    }

    /** 续费VIP */
    suspend fun renew(body: VipRenewForm): PlusApiResultVipPurchaseVO? {
        return client.post(ApiPaths.appPath("/vip/purchase/renew"), body) as? PlusApiResultVipPurchaseVO
    }

    /** 使用加速特权 */
    suspend fun useSpeedUpPrivilege(body: SpeedUpForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/vip/privilege/speed-up"), body) as? PlusApiResultVoid
    }

    /** 领取每日奖励 */
    suspend fun claimDailyReward(): PlusApiResultVipDailyRewardVO? {
        return client.post(ApiPaths.appPath("/vip/points/daily-reward"), null) as? PlusApiResultVipDailyRewardVO
    }

    /** 邀请好友 */
    suspend fun inviteFriend(body: VipInviteForm): PlusApiResultVipInviteVO? {
        return client.post(ApiPaths.appPath("/vip/invite"), body) as? PlusApiResultVipInviteVO
    }

    /** 领取优惠券 */
    suspend fun claimCoupon(couponId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/vip/coupons/$couponId/claim"), null) as? PlusApiResultVoid
    }

    /** 获取VIP状态 */
    suspend fun getVipStatus(): PlusApiResultVipStatusVO? {
        return client.get(ApiPaths.appPath("/vip/status")) as? PlusApiResultVipStatusVO
    }

    /** 获取特权使用情况 */
    suspend fun getPrivilegeUsage(): PlusApiResultVipPrivilegeUsageVO? {
        return client.get(ApiPaths.appPath("/vip/privilege/usage")) as? PlusApiResultVipPrivilegeUsageVO
    }

    /** 获取积分明细 */
    suspend fun getPointsHistory(): PlusApiResultListVipPointsHistoryVO? {
        return client.get(ApiPaths.appPath("/vip/points/history")) as? PlusApiResultListVipPointsHistoryVO
    }

    /** 获取每日奖励状态 */
    suspend fun getDailyRewardStatus(): PlusApiResultVipDailyRewardStatusVO? {
        return client.get(ApiPaths.appPath("/vip/points/daily-reward/status")) as? PlusApiResultVipDailyRewardStatusVO
    }

    /** 获取积分余额 */
    suspend fun getPointsBalance(): PlusApiResultLong? {
        return client.get(ApiPaths.appPath("/vip/points/balance")) as? PlusApiResultLong
    }

    /** 获取套餐分组列表 */
    suspend fun listPackGroups(params: Map<String, Any>? = null): PlusApiResultListVipPackGroupVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups"), params) as? PlusApiResultListVipPackGroupVO
    }

    /** 获取分组详情 */
    suspend fun getPackGroupDetail(groupId: String): PlusApiResultVipPackGroupDetailVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups/$groupId")) as? PlusApiResultVipPackGroupDetailVO
    }

    /** 获取分组套餐 */
    suspend fun listPacksByGroup(groupId: String): PlusApiResultListVipPackVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups/$groupId/packs")) as? PlusApiResultListVipPackVO
    }

    /** 获取所有套餐 */
    suspend fun listAllPacks(params: Map<String, Any>? = null): PlusApiResultListVipPackVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups/packs"), params) as? PlusApiResultListVipPackVO
    }

    /** 获取套餐详情 */
    suspend fun getPackDetail(packId: String): PlusApiResultVipPackDetailVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups/packs/$packId")) as? PlusApiResultVipPackDetailVO
    }

    /** 对比套餐 */
    suspend fun comparePacks(params: Map<String, Any>? = null): PlusApiResultListVipPackGroupVO? {
        return client.get(ApiPaths.appPath("/vip/pack-groups/compare"), params) as? PlusApiResultListVipPackGroupVO
    }

    /** 获取VIP等级列表 */
    suspend fun listVipLevels(): PlusApiResultListVipLevelVO? {
        return client.get(ApiPaths.appPath("/vip/levels")) as? PlusApiResultListVipLevelVO
    }

    /** 获取邀请规则 */
    suspend fun getInviteRules(): PlusApiResultInviteRulesVO? {
        return client.get(ApiPaths.appPath("/vip/invite/rules")) as? PlusApiResultInviteRulesVO
    }

    /** 获取邀请记录 */
    suspend fun getInviteRecords(params: Map<String, Any>? = null): PlusApiResultListVipInviteRecordVO? {
        return client.get(ApiPaths.appPath("/vip/invite/records"), params) as? PlusApiResultListVipInviteRecordVO
    }

    /** 获取邀请信息 */
    suspend fun getInviteInfo(): PlusApiResultVipInviteInfoVO? {
        return client.get(ApiPaths.appPath("/vip/invite/info")) as? PlusApiResultVipInviteInfoVO
    }

    /** 获取VIP信息 */
    suspend fun getVipInfo(): PlusApiResultVipInfoVO? {
        return client.get(ApiPaths.appPath("/vip/info")) as? PlusApiResultVipInfoVO
    }

    /** 获取VIP优惠券 */
    suspend fun listVipCoupons(): PlusApiResultListVipCouponVO? {
        return client.get(ApiPaths.appPath("/vip/coupons")) as? PlusApiResultListVipCouponVO
    }

    /** 获取我的优惠券 */
    suspend fun listMyCoupons(params: Map<String, Any>? = null): PlusApiResultListVipCouponVO? {
        return client.get(ApiPaths.appPath("/vip/coupons/my"), params) as? PlusApiResultListVipCouponVO
    }

    /** 检查VIP状态 */
    suspend fun checkVipStatus(): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/vip/check")) as? PlusApiResultBoolean
    }

    /** 获取VIP权益 */
    suspend fun listVipBenefits(params: Map<String, Any>? = null): PlusApiResultListVipBenefitVO? {
        return client.get(ApiPaths.appPath("/vip/benefits"), params) as? PlusApiResultListVipBenefitVO
    }
}
