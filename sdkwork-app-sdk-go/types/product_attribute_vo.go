package types

// 产品属性
type ProductAttributeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Values []string `json:"values"`
	Searchable bool `json:"searchable"`
	Filterable bool `json:"filterable"`
	Sort int `json:"sort"`
}
