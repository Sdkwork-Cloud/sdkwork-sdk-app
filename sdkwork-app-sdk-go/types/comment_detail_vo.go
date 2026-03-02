package types

// 评论详情响应
type CommentDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CommentId string `json:"commentId"`
	Content string `json:"content"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	UserId int `json:"userId"`
	Status string `json:"status"`
	Likes int `json:"likes"`
	ReplyCount int `json:"replyCount"`
	IsTop bool `json:"isTop"`
	ParentId int `json:"parentId"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
	Replies []CommentVO `json:"replies"`
}
