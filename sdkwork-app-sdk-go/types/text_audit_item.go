package types

// 文本审核项
type TextAuditItem struct {
	Id string `json:"id"`
	AuditResult TextAuditVO `json:"auditResult"`
}
