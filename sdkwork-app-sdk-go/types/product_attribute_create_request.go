package types

// 创建产品属性请求
type ProductAttributeCreateRequest struct {
	Name string `json:"name"`
	Values []string `json:"values"`
	Searchable bool `json:"searchable"`
	Filterable bool `json:"filterable"`
	Sort int `json:"sort"`
}
