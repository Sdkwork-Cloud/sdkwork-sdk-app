package types

// 回复评论表单
type CommentReplyForm struct {
	Content string `json:"content"`
	DeviceInfo string `json:"deviceInfo"`
}
