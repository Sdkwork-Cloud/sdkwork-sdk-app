package types

// Feed项响应
type FeedItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Title string `json:"title"`
	Content string `json:"content"`
	Summary string `json:"summary"`
	CoverImage string `json:"coverImage"`
	ContentType string `json:"contentType"`
	Tags []string `json:"tags"`
	Author AuthorInfo `json:"author"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
	CommentCount int `json:"commentCount"`
	ShareCount int `json:"shareCount"`
	IsLiked bool `json:"isLiked"`
	IsCollected bool `json:"isCollected"`
}
