package types

// 标签响应
type TagVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Color string `json:"color"`
	Description string `json:"description"`
	Count int `json:"count"`
	Status int `json:"status"`
}
