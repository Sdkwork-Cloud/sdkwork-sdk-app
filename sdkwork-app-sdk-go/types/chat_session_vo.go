package types

// 聊天会话响应
type ChatSessionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Status string `json:"status"`
	ModelId string `json:"modelId"`
	MessageCount int `json:"messageCount"`
	UnreadCount int `json:"unreadCount"`
	LastMessageTime string `json:"lastMessageTime"`
	LastMessageContent string `json:"lastMessageContent"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
}
