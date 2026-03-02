package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ActivityApi(private val client: HttpClient) {

    /** 参与活动 */
    suspend fun join(activityId: String, body: ActivityJoinForm): PlusApiResultActivityJoinVO? {
        return client.post(ApiPaths.appPath("/activity/$activityId/join"), body) as? PlusApiResultActivityJoinVO
    }

    /** 领取任务奖励 */
    suspend fun claimTaskReward(taskId: String): PlusApiResultTaskRewardVO? {
        return client.post(ApiPaths.appPath("/activity/tasks/$taskId/claim"), null) as? PlusApiResultTaskRewardVO
    }

    /** 兑换商品 */
    suspend fun exchangeGoods(goodsId: String, body: PointsExchangeForm): PlusApiResultPointsExchangeVO? {
        return client.post(ApiPaths.appPath("/activity/points-store/goods/$goodsId/exchange"), body) as? PlusApiResultPointsExchangeVO
    }

    /** 抽奖 */
    suspend fun drawLottery(lotteryId: String): PlusApiResultLotteryDrawVO? {
        return client.post(ApiPaths.appPath("/activity/lottery/$lotteryId/draw"), null) as? PlusApiResultLotteryDrawVO
    }

    /** 领取奖品 */
    suspend fun claimPrize(prizeId: String): PlusApiResultPrizeClaimVO? {
        return client.post(ApiPaths.appPath("/activity/lottery/prizes/$prizeId/claim"), null) as? PlusApiResultPrizeClaimVO
    }

    /** 每日签到 */
    suspend fun checkIn(): PlusApiResultCheckInVO? {
        return client.post(ApiPaths.appPath("/activity/check-in"), null) as? PlusApiResultCheckInVO
    }

    /** 补签 */
    suspend fun makeUpCheckIn(body: CheckInMakeUpForm): PlusApiResultCheckInMakeUpVO? {
        return client.post(ApiPaths.appPath("/activity/check-in/make-up"), body) as? PlusApiResultCheckInMakeUpVO
    }

    /** 获取活动详情 */
    suspend fun getActivityDetail(activityId: String): PlusApiResultActivityDetailVO? {
        return client.get(ApiPaths.appPath("/activity/$activityId")) as? PlusApiResultActivityDetailVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultListTaskVO? {
        return client.get(ApiPaths.appPath("/activity/tasks"), params) as? PlusApiResultListTaskVO
    }

    /** 获取参与记录 */
    suspend fun getActivityRecords(params: Map<String, Any>? = null): PlusApiResultPageActivityRecordVO? {
        return client.get(ApiPaths.appPath("/activity/records"), params) as? PlusApiResultPageActivityRecordVO
    }

    /** 获取排行榜 */
    suspend fun getRanking(type: String, params: Map<String, Any>? = null): PlusApiResultRankingVO? {
        return client.get(ApiPaths.appPath("/activity/rankings/$type"), params) as? PlusApiResultRankingVO
    }

    /** 获取我的排名 */
    suspend fun getMyRank(type: String, params: Map<String, Any>? = null): PlusApiResultRankInfoVO? {
        return client.get(ApiPaths.appPath("/activity/rankings/$type/my-rank"), params) as? PlusApiResultRankInfoVO
    }

    /** 获取积分商品 */
    suspend fun listPointsGoods(params: Map<String, Any>? = null): PlusApiResultPagePointsGoodsVO? {
        return client.get(ApiPaths.appPath("/activity/points-store/goods"), params) as? PlusApiResultPagePointsGoodsVO
    }

    /** 获取商品详情 */
    suspend fun getPointsGoodsDetail(goodsId: String): PlusApiResultPointsGoodsDetailVO? {
        return client.get(ApiPaths.appPath("/activity/points-store/goods/$goodsId")) as? PlusApiResultPointsGoodsDetailVO
    }

    /** 获取兑换记录 */
    suspend fun getExchangeRecords(params: Map<String, Any>? = null): PlusApiResultPagePointsExchangeRecordVO? {
        return client.get(ApiPaths.appPath("/activity/points-store/exchange-records"), params) as? PlusApiResultPagePointsExchangeRecordVO
    }

    /** 获取抽奖详情 */
    suspend fun getLotteryDetail(lotteryId: String): PlusApiResultLotteryDetailVO? {
        return client.get(ApiPaths.appPath("/activity/lottery/$lotteryId")) as? PlusApiResultLotteryDetailVO
    }

    /** 获取中奖记录 */
    suspend fun getMyPrizes(params: Map<String, Any>? = null): PlusApiResultPageLotteryPrizeVO? {
        return client.get(ApiPaths.appPath("/activity/lottery/my-prizes"), params) as? PlusApiResultPageLotteryPrizeVO
    }

    /** 获取抽奖列表 */
    suspend fun listLotteryActivities(): PlusApiResultListLotteryActivityVO? {
        return client.get(ApiPaths.appPath("/activity/lottery/list")) as? PlusApiResultListLotteryActivityVO
    }

    /** 获取活动列表 */
    suspend fun listActivities(params: Map<String, Any>? = null): PlusApiResultPageActivityVO? {
        return client.get(ApiPaths.appPath("/activity/list"), params) as? PlusApiResultPageActivityVO
    }

    /** 获取签到状态 */
    suspend fun getCheckInStatus(): PlusApiResultCheckInStatusVO? {
        return client.get(ApiPaths.appPath("/activity/check-in/status")) as? PlusApiResultCheckInStatusVO
    }

    /** 获取签到记录 */
    suspend fun getCheckInRecords(params: Map<String, Any>? = null): PlusApiResultListCheckInRecordVO? {
        return client.get(ApiPaths.appPath("/activity/check-in/records"), params) as? PlusApiResultListCheckInRecordVO
    }
}
