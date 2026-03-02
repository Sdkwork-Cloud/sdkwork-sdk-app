package types

// 批量图片审核响应
type BatchImageAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BatchId string `json:"batchId"`
	Results []ImageAuditItem `json:"results"`
	OverallStatus string `json:"overallStatus"`
	TotalCount int `json:"totalCount"`
	PassCount int `json:"passCount"`
	RejectCount int `json:"rejectCount"`
}
