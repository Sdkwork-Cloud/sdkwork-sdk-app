package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ChatApi struct {
    client *sdkhttp.Client
}

func NewChatApi(client *sdkhttp.Client) *ChatApi {
    return &ChatApi{client: client}
}

// 获取会话详情
func (a *ChatApi) GetSessionDetail(sessionId string) (sdktypes.PlusApiResultChatSessionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/chat/sessions/%s", sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultChatSessionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChatSessionDetailVO](raw)
}

// 更新会话
func (a *ChatApi) UpdateSession(sessionId string, body sdktypes.ChatSessionUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/chat/sessions/%s", sessionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 删除会话
func (a *ChatApi) DeleteSession(sessionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/chat/sessions/%s", sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取会话列表
func (a *ChatApi) ListSessions(query map[string]interface{}) (sdktypes.PlusApiResultPageChatSessionVO, error) {
    raw, err := a.client.Get(AppApiPath("/chat/sessions"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageChatSessionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageChatSessionVO](raw)
}

// 创建对话会话
func (a *ChatApi) CreateSession(body sdktypes.ChatSessionCreateForm) (sdktypes.PlusApiResultChatSessionVO, error) {
    raw, err := a.client.Post(AppApiPath("/chat/sessions"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultChatSessionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChatSessionVO](raw)
}

// 停止生成
func (a *ChatApi) StopGeneration(sessionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/stop", sessionId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取消息历史
func (a *ChatApi) GetMessageHistory(sessionId string, query map[string]interface{}) (sdktypes.PlusApiResultPageChatMessageVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages", sessionId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageChatMessageVO](raw)
}

// 发送消息
func (a *ChatApi) SendMessage(sessionId string, body sdktypes.ChatMessageSendForm) (sdktypes.PlusApiResultChatMessageVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages", sessionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChatMessageVO](raw)
}

// 重新生成
func (a *ChatApi) RegenerateMessage(sessionId string, messageId string) (sdktypes.PlusApiResultChatMessageVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages/%s/regenerate", sessionId, messageId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChatMessageVO](raw)
}

// 收藏消息
func (a *ChatApi) FavoriteMessage(sessionId string, messageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages/%s/favorite", sessionId, messageId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏消息
func (a *ChatApi) UnfavoriteMessage(sessionId string, messageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages/%s/favorite", sessionId, messageId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 流式发送消息
func (a *ChatApi) SendMessageStream(sessionId string, body sdktypes.ChatMessageSendForm) (struct{}, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/messages/stream", sessionId)), body, nil, nil, "")
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// 导出对话
func (a *ChatApi) ExportConversation(sessionId string, body sdktypes.ChatExportForm) (sdktypes.PlusApiResultExportVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/export", sessionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultExportVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExportVO](raw)
}

// 复制对话
func (a *ChatApi) CopySession(sessionId string) (sdktypes.PlusApiResultChatSessionVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/chat/sessions/%s/copy", sessionId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultChatSessionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChatSessionVO](raw)
}
