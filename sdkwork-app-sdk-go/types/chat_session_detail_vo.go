package types

// 聊天会话详情响应
type ChatSessionDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Status string `json:"status"`
	UserId string `json:"userId"`
	ModelId string `json:"modelId"`
	SystemPrompt string `json:"systemPrompt"`
	Temperature float64 `json:"temperature"`
	MaxTokens int `json:"maxTokens"`
	TopP float64 `json:"topP"`
	MessageCount int `json:"messageCount"`
	UnreadCount int `json:"unreadCount"`
	LastMessageTime string `json:"lastMessageTime"`
	LastMessageContent string `json:"lastMessageContent"`
	ResourceId string `json:"resourceId"`
	ResourceType string `json:"resourceType"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	Extra map[string]interface{} `json:"extra"`
	Stats SessionStatsVO `json:"stats"`
}
