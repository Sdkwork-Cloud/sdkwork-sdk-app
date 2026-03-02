package types

// 聊天消息响应
type ChatMessageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	SessionId int `json:"sessionId"`
	Content string `json:"content"`
	Type string `json:"type"`
	Format string `json:"format"`
	Status string `json:"status"`
	SenderType string `json:"senderType"`
	SenderId string `json:"senderId"`
	ReceiverId string `json:"receiverId"`
	QuoteMessageId int `json:"quoteMessageId"`
	Thinking string `json:"thinking"`
	ModelId string `json:"modelId"`
	ResponseTime int `json:"responseTime"`
	TokenCount int `json:"tokenCount"`
	Attachments []AttachmentVO `json:"attachments"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
}
