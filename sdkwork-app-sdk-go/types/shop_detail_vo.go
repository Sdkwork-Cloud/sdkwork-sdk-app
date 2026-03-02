package types

// 店铺详情响应
type ShopDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
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
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	OwnerId string `json:"ownerId"`
	OwnerName string `json:"ownerName"`
	ProductCount int `json:"productCount"`
	OrderCount int `json:"orderCount"`
	Rating float64 `json:"rating"`
	FollowerCount int `json:"followerCount"`
}
