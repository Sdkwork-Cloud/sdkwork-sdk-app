package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ActivityApi struct {
    client *sdkhttp.Client
}

func NewActivityApi(client *sdkhttp.Client) *ActivityApi {
    return &ActivityApi{client: client}
}

// 参与活动
func (a *ActivityApi) Join(activityId string, body sdktypes.ActivityJoinForm) (sdktypes.PlusApiResultActivityJoinVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/activity/%s/join", activityId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultActivityJoinVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultActivityJoinVO](raw)
}

// 领取任务奖励
func (a *ActivityApi) ClaimTaskReward(taskId string) (sdktypes.PlusApiResultTaskRewardVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/activity/tasks/%s/claim", taskId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTaskRewardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTaskRewardVO](raw)
}

// 兑换商品
func (a *ActivityApi) ExchangeGoods(goodsId string, body sdktypes.PointsExchangeForm) (sdktypes.PlusApiResultPointsExchangeVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/activity/points-store/goods/%s/exchange", goodsId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsExchangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsExchangeVO](raw)
}

// 抽奖
func (a *ActivityApi) DrawLottery(lotteryId string) (sdktypes.PlusApiResultLotteryDrawVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/activity/lottery/%s/draw", lotteryId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLotteryDrawVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLotteryDrawVO](raw)
}

// 领取奖品
func (a *ActivityApi) ClaimPrize(prizeId string) (sdktypes.PlusApiResultPrizeClaimVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/activity/lottery/prizes/%s/claim", prizeId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPrizeClaimVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPrizeClaimVO](raw)
}

// 每日签到
func (a *ActivityApi) CheckIn() (sdktypes.PlusApiResultCheckInVO, error) {
    raw, err := a.client.Post(AppApiPath("/activity/check-in"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCheckInVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCheckInVO](raw)
}

// 补签
func (a *ActivityApi) MakeUpCheckIn(body sdktypes.CheckInMakeUpForm) (sdktypes.PlusApiResultCheckInMakeUpVO, error) {
    raw, err := a.client.Post(AppApiPath("/activity/check-in/make-up"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCheckInMakeUpVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCheckInMakeUpVO](raw)
}

// 获取活动详情
func (a *ActivityApi) GetActivityDetail(activityId string) (sdktypes.PlusApiResultActivityDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/activity/%s", activityId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultActivityDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultActivityDetailVO](raw)
}

// 获取任务列表
func (a *ActivityApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultListTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTaskVO](raw)
}

// 获取参与记录
func (a *ActivityApi) GetActivityRecords(query map[string]interface{}) (sdktypes.PlusApiResultPageActivityRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageActivityRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageActivityRecordVO](raw)
}

// 获取排行榜
func (a *ActivityApi) GetRanking(type string, query map[string]interface{}) (sdktypes.PlusApiResultRankingVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/activity/rankings/%s", type)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRankingVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRankingVO](raw)
}

// 获取我的排名
func (a *ActivityApi) GetMyRank(type string, query map[string]interface{}) (sdktypes.PlusApiResultRankInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/activity/rankings/%s/my-rank", type)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRankInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRankInfoVO](raw)
}

// 获取积分商品
func (a *ActivityApi) ListPointsGoods(query map[string]interface{}) (sdktypes.PlusApiResultPagePointsGoodsVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/points-store/goods"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePointsGoodsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePointsGoodsVO](raw)
}

// 获取商品详情
func (a *ActivityApi) GetPointsGoodsDetail(goodsId string) (sdktypes.PlusApiResultPointsGoodsDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/activity/points-store/goods/%s", goodsId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPointsGoodsDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsGoodsDetailVO](raw)
}

// 获取兑换记录
func (a *ActivityApi) GetExchangeRecords(query map[string]interface{}) (sdktypes.PlusApiResultPagePointsExchangeRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/points-store/exchange-records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePointsExchangeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePointsExchangeRecordVO](raw)
}

// 获取抽奖详情
func (a *ActivityApi) GetLotteryDetail(lotteryId string) (sdktypes.PlusApiResultLotteryDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/activity/lottery/%s", lotteryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultLotteryDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLotteryDetailVO](raw)
}

// 获取中奖记录
func (a *ActivityApi) GetMyPrizes(query map[string]interface{}) (sdktypes.PlusApiResultPageLotteryPrizeVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/lottery/my-prizes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageLotteryPrizeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageLotteryPrizeVO](raw)
}

// 获取抽奖列表
func (a *ActivityApi) ListLotteryActivities() (sdktypes.PlusApiResultListLotteryActivityVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/lottery/list"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListLotteryActivityVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLotteryActivityVO](raw)
}

// 获取活动列表
func (a *ActivityApi) ListActivities(query map[string]interface{}) (sdktypes.PlusApiResultPageActivityVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageActivityVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageActivityVO](raw)
}

// 获取签到状态
func (a *ActivityApi) GetCheckInStatus() (sdktypes.PlusApiResultCheckInStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/check-in/status"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCheckInStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCheckInStatusVO](raw)
}

// 获取签到记录
func (a *ActivityApi) GetCheckInRecords(query map[string]interface{}) (sdktypes.PlusApiResultListCheckInRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/activity/check-in/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCheckInRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCheckInRecordVO](raw)
}
