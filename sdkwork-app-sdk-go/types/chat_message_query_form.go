package types

// 查询聊天消息请求
type ChatMessageQueryForm struct {
	SessionId int `json:"sessionId"`
	MessageId int `json:"messageId"`
	Page int `json:"page"`
	Size int `json:"size"`
	Sort string `json:"sort"`
}
