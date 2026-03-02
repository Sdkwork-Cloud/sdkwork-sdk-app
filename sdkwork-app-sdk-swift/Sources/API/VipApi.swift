import Foundation

public class VipApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 购买VIP
    public func purchase(body: VipPurchaseForm) async throws -> PlusApiResultVipPurchaseVO? {
        let response = try await client.post(ApiPaths.appPath("/vip/purchase"), body: body)
        return response as? PlusApiResultVipPurchaseVO
    }

    /// 升级VIP
    public func upgrade(body: VipUpgradeForm) async throws -> PlusApiResultVipPurchaseVO? {
        let response = try await client.post(ApiPaths.appPath("/vip/purchase/upgrade"), body: body)
        return response as? PlusApiResultVipPurchaseVO
    }

    /// 续费VIP
    public func renew(body: VipRenewForm) async throws -> PlusApiResultVipPurchaseVO? {
        let response = try await client.post(ApiPaths.appPath("/vip/purchase/renew"), body: body)
        return response as? PlusApiResultVipPurchaseVO
    }

    /// 使用加速特权
    public func useSpeedUpPrivilege(body: SpeedUpForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/vip/privilege/speed-up"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 领取每日奖励
    public func claimDailyReward() async throws -> PlusApiResultVipDailyRewardVO? {
        let response = try await client.post(ApiPaths.appPath("/vip/points/daily-reward"), body: nil)
        return response as? PlusApiResultVipDailyRewardVO
    }

    /// 邀请好友
    public func inviteFriend(body: VipInviteForm) async throws -> PlusApiResultVipInviteVO? {
        let response = try await client.post(ApiPaths.appPath("/vip/invite"), body: body)
        return response as? PlusApiResultVipInviteVO
    }

    /// 领取优惠券
    public func claimCoupon(couponId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/vip/coupons/\(couponId)/claim"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取VIP状态
    public func getVipStatus() async throws -> PlusApiResultVipStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/status"))
        return response as? PlusApiResultVipStatusVO
    }

    /// 获取特权使用情况
    public func getPrivilegeUsage() async throws -> PlusApiResultVipPrivilegeUsageVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/privilege/usage"))
        return response as? PlusApiResultVipPrivilegeUsageVO
    }

    /// 获取积分明细
    public func getPointsHistory() async throws -> PlusApiResultListVipPointsHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/points/history"))
        return response as? PlusApiResultListVipPointsHistoryVO
    }

    /// 获取每日奖励状态
    public func getDailyRewardStatus() async throws -> PlusApiResultVipDailyRewardStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/points/daily-reward/status"))
        return response as? PlusApiResultVipDailyRewardStatusVO
    }

    /// 获取积分余额
    public func getPointsBalance() async throws -> PlusApiResultLong? {
        let response = try await client.get(ApiPaths.appPath("/vip/points/balance"))
        return response as? PlusApiResultLong
    }

    /// 获取套餐分组列表
    public func listPackGroups(params: [String: Any]? = nil) async throws -> PlusApiResultListVipPackGroupVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups"), params: params)
        return response as? PlusApiResultListVipPackGroupVO
    }

    /// 获取分组详情
    public func getPackGroupDetail(groupId: String) async throws -> PlusApiResultVipPackGroupDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups/\(groupId)"))
        return response as? PlusApiResultVipPackGroupDetailVO
    }

    /// 获取分组套餐
    public func listPacksByGroup(groupId: String) async throws -> PlusApiResultListVipPackVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups/\(groupId)/packs"))
        return response as? PlusApiResultListVipPackVO
    }

    /// 获取所有套餐
    public func listAllPacks(params: [String: Any]? = nil) async throws -> PlusApiResultListVipPackVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups/packs"), params: params)
        return response as? PlusApiResultListVipPackVO
    }

    /// 获取套餐详情
    public func getPackDetail(packId: String) async throws -> PlusApiResultVipPackDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups/packs/\(packId)"))
        return response as? PlusApiResultVipPackDetailVO
    }

    /// 对比套餐
    public func comparePacks(params: [String: Any]? = nil) async throws -> PlusApiResultListVipPackGroupVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/pack-groups/compare"), params: params)
        return response as? PlusApiResultListVipPackGroupVO
    }

    /// 获取VIP等级列表
    public func listVipLevels() async throws -> PlusApiResultListVipLevelVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/levels"))
        return response as? PlusApiResultListVipLevelVO
    }

    /// 获取邀请规则
    public func getInviteRules() async throws -> PlusApiResultInviteRulesVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/invite/rules"))
        return response as? PlusApiResultInviteRulesVO
    }

    /// 获取邀请记录
    public func getInviteRecords(params: [String: Any]? = nil) async throws -> PlusApiResultListVipInviteRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/invite/records"), params: params)
        return response as? PlusApiResultListVipInviteRecordVO
    }

    /// 获取邀请信息
    public func getInviteInfo() async throws -> PlusApiResultVipInviteInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/invite/info"))
        return response as? PlusApiResultVipInviteInfoVO
    }

    /// 获取VIP信息
    public func getVipInfo() async throws -> PlusApiResultVipInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/info"))
        return response as? PlusApiResultVipInfoVO
    }

    /// 获取VIP优惠券
    public func listVipCoupons() async throws -> PlusApiResultListVipCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/coupons"))
        return response as? PlusApiResultListVipCouponVO
    }

    /// 获取我的优惠券
    public func listMyCoupons(params: [String: Any]? = nil) async throws -> PlusApiResultListVipCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/coupons/my"), params: params)
        return response as? PlusApiResultListVipCouponVO
    }

    /// 检查VIP状态
    public func checkVipStatus() async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/vip/check"))
        return response as? PlusApiResultBoolean
    }

    /// 获取VIP权益
    public func listVipBenefits(params: [String: Any]? = nil) async throws -> PlusApiResultListVipBenefitVO? {
        let response = try await client.get(ApiPaths.appPath("/vip/benefits"), params: params)
        return response as? PlusApiResultListVipBenefitVO
    }
}
