package types

// 创建评论表单
type CommentCreateForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Content string `json:"content"`
	DeviceInfo string `json:"deviceInfo"`
}
