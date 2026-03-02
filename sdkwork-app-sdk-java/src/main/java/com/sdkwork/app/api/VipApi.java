package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class VipApi {
    private final HttpClient client;
    
    public VipApi(HttpClient client) {
        this.client = client;
    }

    /** 购买VIP */
    public PlusApiResultVipPurchaseVO purchase(VipPurchaseForm body) throws Exception {
        return (PlusApiResultVipPurchaseVO) client.post(ApiPaths.appPath("/vip/purchase"), body);
    }

    /** 升级VIP */
    public PlusApiResultVipPurchaseVO upgrade(VipUpgradeForm body) throws Exception {
        return (PlusApiResultVipPurchaseVO) client.post(ApiPaths.appPath("/vip/purchase/upgrade"), body);
    }

    /** 续费VIP */
    public PlusApiResultVipPurchaseVO renew(VipRenewForm body) throws Exception {
        return (PlusApiResultVipPurchaseVO) client.post(ApiPaths.appPath("/vip/purchase/renew"), body);
    }

    /** 使用加速特权 */
    public PlusApiResultVoid useSpeedUpPrivilege(SpeedUpForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/vip/privilege/speed-up"), body);
    }

    /** 领取每日奖励 */
    public PlusApiResultVipDailyRewardVO claimDailyReward() throws Exception {
        return (PlusApiResultVipDailyRewardVO) client.post(ApiPaths.appPath("/vip/points/daily-reward"), null);
    }

    /** 邀请好友 */
    public PlusApiResultVipInviteVO inviteFriend(VipInviteForm body) throws Exception {
        return (PlusApiResultVipInviteVO) client.post(ApiPaths.appPath("/vip/invite"), body);
    }

    /** 领取优惠券 */
    public PlusApiResultVoid claimCoupon(String couponId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/vip/coupons/" + couponId + "/claim"), null);
    }

    /** 获取VIP状态 */
    public PlusApiResultVipStatusVO getVipStatus() throws Exception {
        return (PlusApiResultVipStatusVO) client.get(ApiPaths.appPath("/vip/status"));
    }

    /** 获取特权使用情况 */
    public PlusApiResultVipPrivilegeUsageVO getPrivilegeUsage() throws Exception {
        return (PlusApiResultVipPrivilegeUsageVO) client.get(ApiPaths.appPath("/vip/privilege/usage"));
    }

    /** 获取积分明细 */
    public PlusApiResultListVipPointsHistoryVO getPointsHistory() throws Exception {
        return (PlusApiResultListVipPointsHistoryVO) client.get(ApiPaths.appPath("/vip/points/history"));
    }

    /** 获取每日奖励状态 */
    public PlusApiResultVipDailyRewardStatusVO getDailyRewardStatus() throws Exception {
        return (PlusApiResultVipDailyRewardStatusVO) client.get(ApiPaths.appPath("/vip/points/daily-reward/status"));
    }

    /** 获取积分余额 */
    public PlusApiResultLong getPointsBalance() throws Exception {
        return (PlusApiResultLong) client.get(ApiPaths.appPath("/vip/points/balance"));
    }

    /** 获取套餐分组列表 */
    public PlusApiResultListVipPackGroupVO listPackGroups(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipPackGroupVO) client.get(ApiPaths.appPath("/vip/pack-groups"), params);
    }

    /** 获取分组详情 */
    public PlusApiResultVipPackGroupDetailVO getPackGroupDetail(String groupId) throws Exception {
        return (PlusApiResultVipPackGroupDetailVO) client.get(ApiPaths.appPath("/vip/pack-groups/" + groupId + ""));
    }

    /** 获取分组套餐 */
    public PlusApiResultListVipPackVO listPacksByGroup(String groupId) throws Exception {
        return (PlusApiResultListVipPackVO) client.get(ApiPaths.appPath("/vip/pack-groups/" + groupId + "/packs"));
    }

    /** 获取所有套餐 */
    public PlusApiResultListVipPackVO listAllPacks(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipPackVO) client.get(ApiPaths.appPath("/vip/pack-groups/packs"), params);
    }

    /** 获取套餐详情 */
    public PlusApiResultVipPackDetailVO getPackDetail(String packId) throws Exception {
        return (PlusApiResultVipPackDetailVO) client.get(ApiPaths.appPath("/vip/pack-groups/packs/" + packId + ""));
    }

    /** 对比套餐 */
    public PlusApiResultListVipPackGroupVO comparePacks(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipPackGroupVO) client.get(ApiPaths.appPath("/vip/pack-groups/compare"), params);
    }

    /** 获取VIP等级列表 */
    public PlusApiResultListVipLevelVO listVipLevels() throws Exception {
        return (PlusApiResultListVipLevelVO) client.get(ApiPaths.appPath("/vip/levels"));
    }

    /** 获取邀请规则 */
    public PlusApiResultInviteRulesVO getInviteRules() throws Exception {
        return (PlusApiResultInviteRulesVO) client.get(ApiPaths.appPath("/vip/invite/rules"));
    }

    /** 获取邀请记录 */
    public PlusApiResultListVipInviteRecordVO getInviteRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipInviteRecordVO) client.get(ApiPaths.appPath("/vip/invite/records"), params);
    }

    /** 获取邀请信息 */
    public PlusApiResultVipInviteInfoVO getInviteInfo() throws Exception {
        return (PlusApiResultVipInviteInfoVO) client.get(ApiPaths.appPath("/vip/invite/info"));
    }

    /** 获取VIP信息 */
    public PlusApiResultVipInfoVO getVipInfo() throws Exception {
        return (PlusApiResultVipInfoVO) client.get(ApiPaths.appPath("/vip/info"));
    }

    /** 获取VIP优惠券 */
    public PlusApiResultListVipCouponVO listVipCoupons() throws Exception {
        return (PlusApiResultListVipCouponVO) client.get(ApiPaths.appPath("/vip/coupons"));
    }

    /** 获取我的优惠券 */
    public PlusApiResultListVipCouponVO listMyCoupons(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipCouponVO) client.get(ApiPaths.appPath("/vip/coupons/my"), params);
    }

    /** 检查VIP状态 */
    public PlusApiResultBoolean checkVipStatus() throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/vip/check"));
    }

    /** 获取VIP权益 */
    public PlusApiResultListVipBenefitVO listVipBenefits(Map<String, Object> params) throws Exception {
        return (PlusApiResultListVipBenefitVO) client.get(ApiPaths.appPath("/vip/benefits"), params);
    }
}
