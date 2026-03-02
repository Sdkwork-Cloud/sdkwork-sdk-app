package types

// 文本审核请求
type TextAuditForm struct {
	Content string `json:"content"`
	ContentId string `json:"contentId"`
	ContentType string `json:"contentType"`
	Scene string `json:"scene"`
	UserId string `json:"userId"`
	CheckTypes []string `json:"checkTypes"`
	Async bool `json:"async"`
}
