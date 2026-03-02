package types

// 评论统计响应
type CommentStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalComments int `json:"totalComments"`
}
