import Foundation

public class AdvertApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 广告设置
    public func getAdvertSettings() async throws -> PlusApiResultAdvertSettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/settings"))
        return response as? PlusApiResultAdvertSettingsVO
    }

    /// 更新广告设置
    public func updateAdvertSettings(body: AdvertSettingsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/advert/settings"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 广告反馈
    public func report(adId: String, body: AdvertReportForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/report"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报播放进度
    public func trackVideoProgress(adId: String, body: VideoProgressForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/progress"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报展示
    public func trackImpression(adId: String, body: AdvertImpressionForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/impression"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报播放完成
    public func trackVideoComplete(adId: String, body: VideoCompleteForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/complete"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报关闭
    public func trackClose(adId: String, body: AdvertCloseForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/close"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报点击
    public func trackClick(adId: String, body: AdvertClickForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/click"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 屏蔽广告
    public func block(adId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/advert/\(adId)/block"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 验证奖励
    public func verifyReward(body: RewardVerifyForm) async throws -> PlusApiResultRewardVerifyVO? {
        let response = try await client.post(ApiPaths.appPath("/advert/rewarded/verify"), body: body)
        return response as? PlusApiResultRewardVerifyVO
    }

    /// 开屏广告
    public func getSplash() async throws -> PlusApiResultSplashAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/splash"))
        return response as? PlusApiResultSplashAdvertVO
    }

    /// 激励视频广告
    public func getRewarded(params: [String: Any]? = nil) async throws -> PlusApiResultRewardedAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/rewarded"), params: params)
        return response as? PlusApiResultRewardedAdvertVO
    }

    /// 广告位列表
    public func listAdvertPositions() async throws -> PlusApiResultListAdvertPositionVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/positions"))
        return response as? PlusApiResultListAdvertPositionVO
    }

    /// 广告位详情
    public func getAdvertPosition(positionId: String) async throws -> PlusApiResultAdvertPositionDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/positions/\(positionId)"))
        return response as? PlusApiResultAdvertPositionDetailVO
    }

    /// 获取位置广告
    public func getAdsByPosition(positionId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/positions/\(positionId)/ads"), params: params)
        return response as? PlusApiResultListAdvertVO
    }

    /// 弹窗广告
    public func getPopup() async throws -> PlusApiResultPopupAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/popup"))
        return response as? PlusApiResultPopupAdvertVO
    }

    /// 插屏广告
    public func getInterstitial(params: [String: Any]? = nil) async throws -> PlusApiResultInterstitialAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/interstitial"), params: params)
        return response as? PlusApiResultInterstitialAdvertVO
    }

    /// 信息流广告
    public func getFeedAdverts(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/feed"), params: params)
        return response as? PlusApiResultListFeedAdvertVO
    }

    /// 广告配置
    public func getAdvertConfig() async throws -> PlusApiResultAdvertConfigVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/config"))
        return response as? PlusApiResultAdvertConfigVO
    }

    /// Banner广告
    public func getBannerAdverts(params: [String: Any]? = nil) async throws -> PlusApiResultListBannerAdvertVO? {
        let response = try await client.get(ApiPaths.appPath("/advert/banner"), params: params)
        return response as? PlusApiResultListBannerAdvertVO
    }
}
