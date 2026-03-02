package types

// 教程信息
type TutorialVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	CategoryId string `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
	CoverImage string `json:"coverImage"`
}
