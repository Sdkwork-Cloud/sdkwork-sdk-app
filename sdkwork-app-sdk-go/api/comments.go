package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CommentsApi struct {
    client *sdkhttp.Client
}

func NewCommentsApi(client *sdkhttp.Client) *CommentsApi {
    return &CommentsApi{client: client}
}

// 发表评论
func (a *CommentsApi) CreateComment(body sdktypes.CommentCreateForm) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Post(AppApiPath("/comments"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 回复评论
func (a *CommentsApi) ReplyComment(commentId string, body sdktypes.CommentReplyForm) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/comments/%s/reply", commentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 置顶评论
func (a *CommentsApi) PinComment(commentId string) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/comments/%s/pin", commentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 取消置顶
func (a *CommentsApi) UnpinComment(commentId string) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/comments/%s/pin", commentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 点赞评论
func (a *CommentsApi) LikeComment(commentId string) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/comments/%s/like", commentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 取消点赞
func (a *CommentsApi) UnlikeComment(commentId string) (sdktypes.PlusApiResultCommentVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/comments/%s/like", commentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentVO](raw)
}

// 获取评论详情
func (a *CommentsApi) GetCommentDetail(commentId string) (sdktypes.PlusApiResultCommentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/comments/%s", commentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCommentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentDetailVO](raw)
}

// 删除评论
func (a *CommentsApi) DeleteComment(commentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/comments/%s", commentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取回复列表
func (a *CommentsApi) GetReplies(commentId string, query map[string]interface{}) (sdktypes.PlusApiResultPageCommentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/comments/%s/replies", commentId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCommentVO](raw)
}

// 获取评论统计
func (a *CommentsApi) GetCommentStatistics(query map[string]interface{}) (sdktypes.PlusApiResultCommentStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/comments/statistics"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCommentStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCommentStatisticsVO](raw)
}

// 获取我的评论
func (a *CommentsApi) GetMy(query map[string]interface{}) (sdktypes.PlusApiResultPageCommentVO, error) {
    raw, err := a.client.Get(AppApiPath("/comments/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCommentVO](raw)
}

// 获取评论列表
func (a *CommentsApi) GetComments(query map[string]interface{}) (sdktypes.PlusApiResultPageCommentVO, error) {
    raw, err := a.client.Get(AppApiPath("/comments/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCommentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCommentVO](raw)
}
