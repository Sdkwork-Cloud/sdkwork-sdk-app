package types

// 审核申诉响应
type AuditAppealVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AppealId string `json:"appealId"`
	RecordId string `json:"recordId"`
	Reason string `json:"reason"`
	Description string `json:"description"`
	EvidenceUrl string `json:"evidenceUrl"`
	Status string `json:"status"`
	Result string `json:"result"`
	Comment string `json:"comment"`
	SubmitTime string `json:"submitTime"`
	ProcessTime string `json:"processTime"`
}
