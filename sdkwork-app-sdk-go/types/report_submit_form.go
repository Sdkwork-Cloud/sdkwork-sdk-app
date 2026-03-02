package types

// 举报提交表单
type ReportSubmitForm struct {
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
	ScreenshotUrl string `json:"screenshotUrl"`
}
