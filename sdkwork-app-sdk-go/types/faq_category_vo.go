package types

// FAQ分类信息
type FaqCategoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Icon string `json:"icon"`
	SortOrder int `json:"sortOrder"`
	FaqCount int `json:"faqCount"`
}
