package types

// 视频审核请求
type VideoAuditForm struct {
	VideoUrl string `json:"videoUrl"`
	ContentId string `json:"contentId"`
	Title string `json:"title"`
	Description string `json:"description"`
	ContentType string `json:"contentType"`
	CheckTypes []string `json:"checkTypes"`
	CallbackUrl string `json:"callbackUrl"`
	Duration int `json:"duration"`
}
