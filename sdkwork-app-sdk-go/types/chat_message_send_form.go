package types

// 发送聊天消息请求
type ChatMessageSendForm struct {
	SessionId int `json:"sessionId"`
	Content string `json:"content"`
	Type string `json:"type"`
	Format string `json:"format"`
	QuoteMessageId int `json:"quoteMessageId"`
	NeedThinking bool `json:"needThinking"`
	Streaming bool `json:"streaming"`
	ModelId string `json:"modelId"`
	SystemPrompt string `json:"systemPrompt"`
	Temperature float64 `json:"temperature"`
	MaxTokens int `json:"maxTokens"`
	TopP float64 `json:"topP"`
}
