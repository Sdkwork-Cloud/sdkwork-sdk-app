package types

// 反馈提交表单
type FeedbackSubmitForm struct {
	Type string `json:"type"`
	Content string `json:"content"`
	Contact string `json:"contact"`
	AttachmentUrl string `json:"attachmentUrl"`
	ScreenshotUrl string `json:"screenshotUrl"`
}
