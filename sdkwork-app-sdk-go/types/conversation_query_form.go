package types

// 查询会话列表请求
type ConversationQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	ConversationType string `json:"conversationType"`
	ShowUnread bool `json:"showUnread"`
	Keyword string `json:"keyword"`
}
