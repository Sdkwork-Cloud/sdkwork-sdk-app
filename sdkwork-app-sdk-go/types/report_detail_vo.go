package types

// 举报详情信息
type ReportDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
	ScreenshotUrl string `json:"screenshotUrl"`
	Status string `json:"status"`
	SubmitTime string `json:"submitTime"`
	ProcessTime string `json:"processTime"`
	ProcessResult string `json:"processResult"`
}
