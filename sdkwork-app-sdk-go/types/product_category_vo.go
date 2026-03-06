package types

// 产品分类
type ProductCategoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Sort int `json:"sort"`
	Enabled bool `json:"enabled"`
	Children []ProductCategoryVO `json:"children"`
}
