package types

// 产品详情
type ProductDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Type string `json:"type"`
	Description string `json:"description"`
	Summary string `json:"summary"`
	CategoryId string `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	BrandId string `json:"brandId"`
	BrandName string `json:"brandName"`
	TagIds []string `json:"tagIds"`
	Tags []string `json:"tags"`
	MainImage string `json:"mainImage"`
	Images []string `json:"images"`
	VideoUrl string `json:"videoUrl"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	Sales int `json:"sales"`
	Status string `json:"status"`
	Recommended bool `json:"recommended"`
	Hot bool `json:"hot"`
	Sort int `json:"sort"`
	ShelfTime string `json:"shelfTime"`
	OffShelfTime string `json:"offShelfTime"`
	Attributes []ProductAttributeVO `json:"attributes"`
	Skus []SkuVO `json:"skus"`
	ReviewStatistics map[string]interface{} `json:"reviewStatistics"`
}
