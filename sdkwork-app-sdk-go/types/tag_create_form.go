package types

// 创建标签请求
type TagCreateForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Color string `json:"color"`
	Description string `json:"description"`
	Status int `json:"status"`
}
