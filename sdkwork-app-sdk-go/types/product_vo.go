package types

// 产品信息
type ProductVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Type string `json:"type"`
	Summary string `json:"summary"`
	MainImage string `json:"mainImage"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Sales int `json:"sales"`
	Status string `json:"status"`
	Recommended bool `json:"recommended"`
	Hot bool `json:"hot"`
	CategoryName string `json:"categoryName"`
	BrandName string `json:"brandName"`
	Tags []string `json:"tags"`
}
