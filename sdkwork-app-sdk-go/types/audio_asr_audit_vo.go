package types

// 语音转文字审核响应
type AudioAsrAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	FullText string `json:"fullText"`
	Segments []TimestampedSegment `json:"segments"`
	TextAuditResult TextAuditVO `json:"textAuditResult"`
	OverallResult string `json:"overallResult"`
	Language string `json:"language"`
}
