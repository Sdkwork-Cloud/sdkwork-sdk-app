import Foundation

public class ActivityApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 参与活动
    public func join(activityId: String, body: ActivityJoinForm) async throws -> PlusApiResultActivityJoinVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/\(activityId)/join"), body: body)
        return response as? PlusApiResultActivityJoinVO
    }

    /// 领取任务奖励
    public func claimTaskReward(taskId: String) async throws -> PlusApiResultTaskRewardVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/tasks/\(taskId)/claim"), body: nil)
        return response as? PlusApiResultTaskRewardVO
    }

    /// 兑换商品
    public func exchangeGoods(goodsId: String, body: PointsExchangeForm) async throws -> PlusApiResultPointsExchangeVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/points-store/goods/\(goodsId)/exchange"), body: body)
        return response as? PlusApiResultPointsExchangeVO
    }

    /// 抽奖
    public func drawLottery(lotteryId: String) async throws -> PlusApiResultLotteryDrawVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/lottery/\(lotteryId)/draw"), body: nil)
        return response as? PlusApiResultLotteryDrawVO
    }

    /// 领取奖品
    public func claimPrize(prizeId: String) async throws -> PlusApiResultPrizeClaimVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/lottery/prizes/\(prizeId)/claim"), body: nil)
        return response as? PlusApiResultPrizeClaimVO
    }

    /// 每日签到
    public func checkIn() async throws -> PlusApiResultCheckInVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/check-in"), body: nil)
        return response as? PlusApiResultCheckInVO
    }

    /// 补签
    public func makeUpCheckIn(body: CheckInMakeUpForm) async throws -> PlusApiResultCheckInMakeUpVO? {
        let response = try await client.post(ApiPaths.appPath("/activity/check-in/make-up"), body: body)
        return response as? PlusApiResultCheckInMakeUpVO
    }

    /// 获取活动详情
    public func getActivityDetail(activityId: String) async throws -> PlusApiResultActivityDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/\(activityId)"))
        return response as? PlusApiResultActivityDetailVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultListTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/tasks"), params: params)
        return response as? PlusApiResultListTaskVO
    }

    /// 获取参与记录
    public func getActivityRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPageActivityRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/records"), params: params)
        return response as? PlusApiResultPageActivityRecordVO
    }

    /// 获取排行榜
    public func getRanking(type: String, params: [String: Any]? = nil) async throws -> PlusApiResultRankingVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/rankings/\(type)"), params: params)
        return response as? PlusApiResultRankingVO
    }

    /// 获取我的排名
    public func getMyRank(type: String, params: [String: Any]? = nil) async throws -> PlusApiResultRankInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/rankings/\(type)/my-rank"), params: params)
        return response as? PlusApiResultRankInfoVO
    }

    /// 获取积分商品
    public func listPointsGoods(params: [String: Any]? = nil) async throws -> PlusApiResultPagePointsGoodsVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/points-store/goods"), params: params)
        return response as? PlusApiResultPagePointsGoodsVO
    }

    /// 获取商品详情
    public func getPointsGoodsDetail(goodsId: String) async throws -> PlusApiResultPointsGoodsDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/points-store/goods/\(goodsId)"))
        return response as? PlusApiResultPointsGoodsDetailVO
    }

    /// 获取兑换记录
    public func getExchangeRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPagePointsExchangeRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/points-store/exchange-records"), params: params)
        return response as? PlusApiResultPagePointsExchangeRecordVO
    }

    /// 获取抽奖详情
    public func getLotteryDetail(lotteryId: String) async throws -> PlusApiResultLotteryDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/lottery/\(lotteryId)"))
        return response as? PlusApiResultLotteryDetailVO
    }

    /// 获取中奖记录
    public func getMyPrizes(params: [String: Any]? = nil) async throws -> PlusApiResultPageLotteryPrizeVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/lottery/my-prizes"), params: params)
        return response as? PlusApiResultPageLotteryPrizeVO
    }

    /// 获取抽奖列表
    public func listLotteryActivities() async throws -> PlusApiResultListLotteryActivityVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/lottery/list"))
        return response as? PlusApiResultListLotteryActivityVO
    }

    /// 获取活动列表
    public func listActivities(params: [String: Any]? = nil) async throws -> PlusApiResultPageActivityVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/list"), params: params)
        return response as? PlusApiResultPageActivityVO
    }

    /// 获取签到状态
    public func getCheckInStatus() async throws -> PlusApiResultCheckInStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/check-in/status"))
        return response as? PlusApiResultCheckInStatusVO
    }

    /// 获取签到记录
    public func getCheckInRecords(params: [String: Any]? = nil) async throws -> PlusApiResultListCheckInRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/activity/check-in/records"), params: params)
        return response as? PlusApiResultListCheckInRecordVO
    }
}
