package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ActivityApi {
    private final HttpClient client;
    
    public ActivityApi(HttpClient client) {
        this.client = client;
    }

    /** 参与活动 */
    public PlusApiResultActivityJoinVO join(String activityId, ActivityJoinForm body) throws Exception {
        return (PlusApiResultActivityJoinVO) client.post(ApiPaths.appPath("/activity/" + activityId + "/join"), body);
    }

    /** 领取任务奖励 */
    public PlusApiResultTaskRewardVO claimTaskReward(String taskId) throws Exception {
        return (PlusApiResultTaskRewardVO) client.post(ApiPaths.appPath("/activity/tasks/" + taskId + "/claim"), null);
    }

    /** 兑换商品 */
    public PlusApiResultPointsExchangeVO exchangeGoods(String goodsId, PointsExchangeForm body) throws Exception {
        return (PlusApiResultPointsExchangeVO) client.post(ApiPaths.appPath("/activity/points-store/goods/" + goodsId + "/exchange"), body);
    }

    /** 抽奖 */
    public PlusApiResultLotteryDrawVO drawLottery(String lotteryId) throws Exception {
        return (PlusApiResultLotteryDrawVO) client.post(ApiPaths.appPath("/activity/lottery/" + lotteryId + "/draw"), null);
    }

    /** 领取奖品 */
    public PlusApiResultPrizeClaimVO claimPrize(String prizeId) throws Exception {
        return (PlusApiResultPrizeClaimVO) client.post(ApiPaths.appPath("/activity/lottery/prizes/" + prizeId + "/claim"), null);
    }

    /** 每日签到 */
    public PlusApiResultCheckInVO checkIn() throws Exception {
        return (PlusApiResultCheckInVO) client.post(ApiPaths.appPath("/activity/check-in"), null);
    }

    /** 补签 */
    public PlusApiResultCheckInMakeUpVO makeUpCheckIn(CheckInMakeUpForm body) throws Exception {
        return (PlusApiResultCheckInMakeUpVO) client.post(ApiPaths.appPath("/activity/check-in/make-up"), body);
    }

    /** 获取活动详情 */
    public PlusApiResultActivityDetailVO getActivityDetail(String activityId) throws Exception {
        return (PlusApiResultActivityDetailVO) client.get(ApiPaths.appPath("/activity/" + activityId + ""));
    }

    /** 获取任务列表 */
    public PlusApiResultListTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultListTaskVO) client.get(ApiPaths.appPath("/activity/tasks"), params);
    }

    /** 获取参与记录 */
    public PlusApiResultPageActivityRecordVO getActivityRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageActivityRecordVO) client.get(ApiPaths.appPath("/activity/records"), params);
    }

    /** 获取排行榜 */
    public PlusApiResultRankingVO getRanking(String type, Map<String, Object> params) throws Exception {
        return (PlusApiResultRankingVO) client.get(ApiPaths.appPath("/activity/rankings/" + type + ""), params);
    }

    /** 获取我的排名 */
    public PlusApiResultRankInfoVO getMyRank(String type, Map<String, Object> params) throws Exception {
        return (PlusApiResultRankInfoVO) client.get(ApiPaths.appPath("/activity/rankings/" + type + "/my-rank"), params);
    }

    /** 获取积分商品 */
    public PlusApiResultPagePointsGoodsVO listPointsGoods(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePointsGoodsVO) client.get(ApiPaths.appPath("/activity/points-store/goods"), params);
    }

    /** 获取商品详情 */
    public PlusApiResultPointsGoodsDetailVO getPointsGoodsDetail(String goodsId) throws Exception {
        return (PlusApiResultPointsGoodsDetailVO) client.get(ApiPaths.appPath("/activity/points-store/goods/" + goodsId + ""));
    }

    /** 获取兑换记录 */
    public PlusApiResultPagePointsExchangeRecordVO getExchangeRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePointsExchangeRecordVO) client.get(ApiPaths.appPath("/activity/points-store/exchange-records"), params);
    }

    /** 获取抽奖详情 */
    public PlusApiResultLotteryDetailVO getLotteryDetail(String lotteryId) throws Exception {
        return (PlusApiResultLotteryDetailVO) client.get(ApiPaths.appPath("/activity/lottery/" + lotteryId + ""));
    }

    /** 获取中奖记录 */
    public PlusApiResultPageLotteryPrizeVO getMyPrizes(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageLotteryPrizeVO) client.get(ApiPaths.appPath("/activity/lottery/my-prizes"), params);
    }

    /** 获取抽奖列表 */
    public PlusApiResultListLotteryActivityVO listLotteryActivities() throws Exception {
        return (PlusApiResultListLotteryActivityVO) client.get(ApiPaths.appPath("/activity/lottery/list"));
    }

    /** 获取活动列表 */
    public PlusApiResultPageActivityVO listActivities(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageActivityVO) client.get(ApiPaths.appPath("/activity/list"), params);
    }

    /** 获取签到状态 */
    public PlusApiResultCheckInStatusVO getCheckInStatus() throws Exception {
        return (PlusApiResultCheckInStatusVO) client.get(ApiPaths.appPath("/activity/check-in/status"));
    }

    /** 获取签到记录 */
    public PlusApiResultListCheckInRecordVO getCheckInRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultListCheckInRecordVO) client.get(ApiPaths.appPath("/activity/check-in/records"), params);
    }
}
