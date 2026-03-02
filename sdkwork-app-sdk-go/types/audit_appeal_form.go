package types

// 审核申诉请求
type AuditAppealForm struct {
	Reason string `json:"reason"`
	Description string `json:"description"`
	EvidenceUrl string `json:"evidenceUrl"`
	ContactEmail string `json:"contactEmail"`
	ExpectedAction string `json:"expectedAction"`
}
