package types

// 教程详情信息
type TutorialDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	Content string `json:"content"`
	CategoryId string `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
	CoverImage string `json:"coverImage"`
}
