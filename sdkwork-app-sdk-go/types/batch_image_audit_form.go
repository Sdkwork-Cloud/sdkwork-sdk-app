package types

// 批量图片审核请求
type BatchImageAuditForm struct {
	Images []ImageItem `json:"images"`
	CheckTypes []string `json:"checkTypes"`
	Scene string `json:"scene"`
}
