package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type VoteApi struct {
    client *sdkhttp.Client
}

func NewVoteApi(client *sdkhttp.Client) *VoteApi {
    return &VoteApi{client: client}
}

// 投票
func (a *VoteApi) Vote(body sdktypes.VoteForm) (sdktypes.PlusApiResultVoteVO, error) {
    raw, err := a.client.Post(AppApiPath("/vote"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteVO](raw)
}

// 取消投票
func (a *VoteApi) Cancel(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/vote"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 切换投票
func (a *VoteApi) Toggle(body sdktypes.VoteForm) (sdktypes.PlusApiResultVoteVO, error) {
    raw, err := a.client.Post(AppApiPath("/vote/toggle"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteVO](raw)
}

// 点赞
func (a *VoteApi) Like(query map[string]interface{}) (sdktypes.PlusApiResultVoteVO, error) {
    raw, err := a.client.Post(AppApiPath("/vote/like"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteVO](raw)
}

// 点踩
func (a *VoteApi) Dislike(query map[string]interface{}) (sdktypes.PlusApiResultVoteVO, error) {
    raw, err := a.client.Post(AppApiPath("/vote/dislike"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteVO](raw)
}

// 获取投票详情
func (a *VoteApi) GetVoteDetail(voteId string) (sdktypes.PlusApiResultVoteDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/vote/%s", voteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoteDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteDetailVO](raw)
}

// 获取热门内容
func (a *VoteApi) GetTopLikedContent(query map[string]interface{}) (sdktypes.PlusApiResultListLong, error) {
    raw, err := a.client.Get(AppApiPath("/vote/top-liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListLong
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLong](raw)
}

// 获取投票状态
func (a *VoteApi) GetVoteStatus(query map[string]interface{}) (sdktypes.PlusApiResultVoteStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/vote/status"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoteStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteStatusVO](raw)
}

// 获取投票统计
func (a *VoteApi) GetVoteStatistics(query map[string]interface{}) (sdktypes.PlusApiResultVoteStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/vote/statistics"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoteStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoteStatisticsVO](raw)
}

// 获取我的投票历史
func (a *VoteApi) GetMyVotes(query map[string]interface{}) (sdktypes.PlusApiResultPageVoteDetailVO, error) {
    raw, err := a.client.Get(AppApiPath("/vote/my-votes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVoteDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVoteDetailVO](raw)
}
