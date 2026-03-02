import Foundation

public class ShareApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 更新分享设置
    public func updateShareSettings(shareId: String, body: ShareUpdateForm) async throws -> PlusApiResultShareRecordVO? {
        let response = try await client.put(ApiPaths.appPath("/share/\(shareId)"), body: body)
        return response as? PlusApiResultShareRecordVO
    }

    /// 取消分享
    public func cancel(shareId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/share/\(shareId)"))
        return response as? PlusApiResultVoid
    }

    /// 创建分享
    public func createShare(body: ShareCreateForm) async throws -> PlusApiResultShareCreateVO? {
        let response = try await client.post(ApiPaths.appPath("/share"), body: body)
        return response as? PlusApiResultShareCreateVO
    }

    /// 访问分享
    public func visit(shareCode: String, body: ShareVisitForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/share/\(shareCode)/visit"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 验证分享密码
    public func verifySharePassword(shareCode: String, body: ShareVerifyForm) async throws -> PlusApiResultShareVerifyVO? {
        let response = try await client.post(ApiPaths.appPath("/share/\(shareCode)/verify"), body: body)
        return response as? PlusApiResultShareVerifyVO
    }

    /// 上报分享
    public func track(body: ShareTrackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/share/track"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 生成分享海报
    public func generateSharePoster(body: SharePosterForm) async throws -> PlusApiResultSharePosterVO? {
        let response = try await client.post(ApiPaths.appPath("/share/poster"), body: body)
        return response as? PlusApiResultSharePosterVO
    }

    /// 领取邀请奖励
    public func claimInviteReward(rewardId: String) async throws -> PlusApiResultInviteRewardClaimVO? {
        let response = try await client.post(ApiPaths.appPath("/share/invite/rewards/\(rewardId)/claim"), body: nil)
        return response as? PlusApiResultInviteRewardClaimVO
    }

    /// 生成邀请链接
    public func generateInviteLink(body: InviteLinkForm) async throws -> PlusApiResultInviteLinkVO? {
        let response = try await client.post(ApiPaths.appPath("/share/invite/link"), body: body)
        return response as? PlusApiResultInviteLinkVO
    }

    /// 获取访问记录
    public func getShareVisitors(shareId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageShareVisitorVO? {
        let response = try await client.get(ApiPaths.appPath("/share/\(shareId)/visitors"), params: params)
        return response as? PlusApiResultPageShareVisitorVO
    }

    /// 获取分享统计
    public func getShareStatistics(shareId: String) async throws -> PlusApiResultShareStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/share/\(shareId)/statistics"))
        return response as? PlusApiResultShareStatisticsVO
    }

    /// 获取分享信息
    public func getShareInfo(shareCode: String, params: [String: Any]? = nil) async throws -> PlusApiResultShareInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/share/\(shareCode)"), params: params)
        return response as? PlusApiResultShareInfoVO
    }

    /// 获取分享平台配置
    public func getSharePlatforms() async throws -> PlusApiResultListSharePlatformVO? {
        let response = try await client.get(ApiPaths.appPath("/share/platforms"))
        return response as? PlusApiResultListSharePlatformVO
    }

    /// 获取我的分享
    public func listMyShares(params: [String: Any]? = nil) async throws -> PlusApiResultPageShareRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/share/my-shares"), params: params)
        return response as? PlusApiResultPageShareRecordVO
    }

    /// 获取邀请记录
    public func getInviteRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPageInviteRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/share/invite/records"), params: params)
        return response as? PlusApiResultPageInviteRecordVO
    }

    /// 获取邀请信息
    public func getInviteInfo() async throws -> PlusApiResultInviteInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/share/invite/info"))
        return response as? PlusApiResultInviteInfoVO
    }

    /// 批量取消分享
    public func batchCancelShares() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/share/batch"))
        return response as? PlusApiResultVoid
    }
}
