package types

// 广告设置VO
type AdvertSettingsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Enabled bool `json:"enabled"`
	Personalized bool `json:"personalized"`
	MaxDailyAds int `json:"maxDailyAds"`
	AdBlockLevel string `json:"adBlockLevel"`
	RewardVideoEnabled bool `json:"rewardVideoEnabled"`
	InterstitialEnabled bool `json:"interstitialEnabled"`
	BannerEnabled bool `json:"bannerEnabled"`
	LastUpdated string `json:"lastUpdated"`
}
