package types

// 反馈跟进表单
type FeedbackFollowUpForm struct {
	FeedbackId string `json:"feedbackId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
}
