package types

// FAQ详情信息
type FaqDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Question string `json:"question"`
	Answer string `json:"answer"`
	CategoryId string `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	ViewCount int `json:"viewCount"`
	HelpfulCount int `json:"helpfulCount"`
}
