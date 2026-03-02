package types

// 支持消息请求表单
type SupportMessageRequest struct {
	SessionId string `json:"sessionId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
}
