package types

// 图片审核请求
type ImageAuditForm struct {
	ImageUrl string `json:"imageUrl"`
	ImageBase64 string `json:"imageBase64"`
	ContentId string `json:"contentId"`
	ContentType string `json:"contentType"`
	CheckTypes []string `json:"checkTypes"`
	Scene string `json:"scene"`
	Async bool `json:"async"`
}
