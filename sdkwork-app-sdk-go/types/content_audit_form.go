package types

// 综合内容审核请求
type ContentAuditForm struct {
	ContentId string `json:"contentId"`
	TextContent string `json:"textContent"`
	ImageUrls []string `json:"imageUrls"`
	VideoUrl string `json:"videoUrl"`
	AudioUrl string `json:"audioUrl"`
	ContentType string `json:"contentType"`
	Scene string `json:"scene"`
	CheckTypes []string `json:"checkTypes"`
	Metadata map[string]interface{} `json:"metadata"`
	UserId string `json:"userId"`
}
