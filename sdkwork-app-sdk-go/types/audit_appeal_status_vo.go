package types

// 申诉状态响应
type AuditAppealStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AppealId string `json:"appealId"`
	RecordId string `json:"recordId"`
	CurrentStatus string `json:"currentStatus"`
	StatusDescription string `json:"statusDescription"`
	Progress int `json:"progress"`
	EstimatedCompleteTime string `json:"estimatedCompleteTime"`
	Result string `json:"result"`
	CanAddEvidence bool `json:"canAddEvidence"`
	CanCancel bool `json:"canCancel"`
}
