package types

// 店铺创建请求
type ShopCreateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	LogoUrl string `json:"logoUrl"`
	CoverUrl string `json:"coverUrl"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	Address string `json:"address"`
	Latitude float64 `json:"latitude"`
	Longitude float64 `json:"longitude"`
	LicenseNumber string `json:"licenseNumber"`
	Tags []string `json:"tags"`
	BusinessHours string `json:"businessHours"`
}
