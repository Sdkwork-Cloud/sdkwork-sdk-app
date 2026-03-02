package types

// FAQ信息
type FaqVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Question string `json:"question"`
	CategoryId string `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	ViewCount int `json:"viewCount"`
	HelpfulCount int `json:"helpfulCount"`
}
