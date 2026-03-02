package types

// 支持消息信息
type SupportMessageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	SessionId string `json:"sessionId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
	SenderType string `json:"senderType"`
	SendTime string `json:"sendTime"`
	Read bool `json:"read"`
}
