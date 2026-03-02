package types

// 发送消息请求
type SendMessageForm struct {
	RecipientId string `json:"recipientId"`
	Content string `json:"content"`
	MessageType string `json:"messageType"`
	ConversationId string `json:"conversationId"`
	AttachmentUrl string `json:"attachmentUrl"`
}
