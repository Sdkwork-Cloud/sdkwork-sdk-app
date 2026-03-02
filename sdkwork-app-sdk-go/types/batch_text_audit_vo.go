package types

// 批量文本审核响应
type BatchTextAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BatchId string `json:"batchId"`
	Results []TextAuditItem `json:"results"`
	OverallStatus string `json:"overallStatus"`
	TotalCount int `json:"totalCount"`
	PassCount int `json:"passCount"`
	RejectCount int `json:"rejectCount"`
}
