package types

// 图片OCR审核响应
type ImageOcrAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	OcrText string `json:"ocrText"`
	TextBlocks []TextBlock `json:"textBlocks"`
	TextAuditResult TextAuditVO `json:"textAuditResult"`
	OverallResult string `json:"overallResult"`
}
