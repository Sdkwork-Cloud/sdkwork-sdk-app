package types

// 审核记录响应
type AuditRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	ContentId string `json:"contentId"`
	ContentType string `json:"contentType"`
	ContentPreview string `json:"contentPreview"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	CheckTypes []string `json:"checkTypes"`
	ViolationTypes []string `json:"violationTypes"`
	AuditTime string `json:"auditTime"`
	ProcessTime int `json:"processTime"`
}
