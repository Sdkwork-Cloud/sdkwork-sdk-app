package types

// 分类响应
type CategoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	Sort int `json:"sort"`
	Status int `json:"status"`
}
