package types

// 更新聊天会话请求
type ChatSessionUpdateForm struct {
	SessionId int `json:"sessionId"`
	Name string `json:"name"`
	Description string `json:"description"`
	ModelId string `json:"modelId"`
	SystemPrompt string `json:"systemPrompt"`
	Temperature float64 `json:"temperature"`
	MaxTokens int `json:"maxTokens"`
	TopP float64 `json:"topP"`
	Status string `json:"status"`
}
