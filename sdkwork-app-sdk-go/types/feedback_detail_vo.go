package types

// 反馈详情信息
type FeedbackDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	Content string `json:"content"`
	Contact string `json:"contact"`
	AttachmentUrl string `json:"attachmentUrl"`
	ScreenshotUrl string `json:"screenshotUrl"`
	Status string `json:"status"`
	SubmitTime string `json:"submitTime"`
	ProcessTime string `json:"processTime"`
	FollowUps []FeedbackFollowUpVO `json:"followUps"`
}
