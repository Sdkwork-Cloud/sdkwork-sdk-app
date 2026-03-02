package types

// 分类类型响应
type CategoryTypeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Type string `json:"type"`
	Name string `json:"name"`
	Description string `json:"description"`
}
