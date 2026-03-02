package types


type ShopStatisticsVO struct {
	TotalShops int `json:"totalShops"`
	ActiveShops int `json:"activeShops"`
	InactiveShops int `json:"inactiveShops"`
}
