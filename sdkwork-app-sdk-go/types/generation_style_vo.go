package types

// 生成风格响应
type GenerationStyleVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StyleId string `json:"styleId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	IsPublic bool `json:"isPublic"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
	CoverImageUrl string `json:"coverImageUrl"`
}
