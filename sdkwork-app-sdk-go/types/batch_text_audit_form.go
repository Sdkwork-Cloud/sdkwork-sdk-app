package types

// 批量文本审核请求
type BatchTextAuditForm struct {
	Items []TextItem `json:"items"`
	CheckTypes []string `json:"checkTypes"`
	Scene string `json:"scene"`
}
