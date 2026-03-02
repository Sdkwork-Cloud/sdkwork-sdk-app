package types

// 图片审核项
type ImageAuditItem struct {
	Id string `json:"id"`
	AuditResult ImageAuditVO `json:"auditResult"`
}
