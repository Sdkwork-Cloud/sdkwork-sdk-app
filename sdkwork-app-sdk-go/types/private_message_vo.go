package types

// 私信消息响应
type PrivateMessageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	MessageId string `json:"messageId"`
	SenderId string `json:"senderId"`
	RecipientId string `json:"recipientId"`
	Content string `json:"content"`
	MessageType string `json:"messageType"`
	SendTime string `json:"sendTime"`
	IsRead bool `json:"isRead"`
	AttachmentUrl string `json:"attachmentUrl"`
}
