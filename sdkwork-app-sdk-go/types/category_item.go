package types

// 类别项
type CategoryItem struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	ParentId string `json:"parentId"`
	Subcategories []CategoryItem `json:"subcategories"`
	Tags []string `json:"tags"`
}
