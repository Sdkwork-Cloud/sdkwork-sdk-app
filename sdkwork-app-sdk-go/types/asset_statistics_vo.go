package types


type AssetStatisticsVO struct {
	TotalAssets int `json:"totalAssets"`
	ImageCount int `json:"imageCount"`
	VideoCount int `json:"videoCount"`
	AudioCount int `json:"audioCount"`
}
