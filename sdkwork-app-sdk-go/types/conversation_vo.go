package types

// 会话响应
type ConversationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ConversationId string `json:"conversationId"`
	ConversationType string `json:"conversationType"`
	OtherUserId string `json:"otherUserId"`
	OtherUsername string `json:"otherUsername"`
	OtherNickname string `json:"otherNickname"`
	OtherAvatar string `json:"otherAvatar"`
	LastMessage string `json:"lastMessage"`
	LastMessageTime string `json:"lastMessageTime"`
	UnreadCount int `json:"unreadCount"`
	IsTop bool `json:"isTop"`
}
