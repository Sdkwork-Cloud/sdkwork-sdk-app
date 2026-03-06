package types


type ProductCategoryUpdateRequest struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Sort int `json:"sort"`
	Enabled bool `json:"enabled"`
}
