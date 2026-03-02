package types

// 创建聊天会话请求
type ChatSessionCreateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	ModelId string `json:"modelId"`
	SystemPrompt string `json:"systemPrompt"`
	Temperature float64 `json:"temperature"`
	MaxTokens int `json:"maxTokens"`
	TopP float64 `json:"topP"`
	Type string `json:"type"`
	ResourceId string `json:"resourceId"`
}
