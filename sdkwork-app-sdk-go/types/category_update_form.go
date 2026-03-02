package types

// 更新分类请求
type CategoryUpdateForm struct {
	Name string `json:"name"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	Sort int `json:"sort"`
	Status int `json:"status"`
}
