package types

// 创建分类请求
type CategoryCreateForm struct {
	Name string `json:"name"`
	Type string `json:"type"`
	Code string `json:"code"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	Sort int `json:"sort"`
	Status int `json:"status"`
}
