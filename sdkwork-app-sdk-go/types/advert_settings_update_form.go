package types

// 广告设置更新请求
type AdvertSettingsUpdateForm struct {
	Enabled bool `json:"enabled"`
	Personalized bool `json:"personalized"`
	MaxDailyAds int `json:"maxDailyAds"`
	AdBlockLevel string `json:"adBlockLevel"`
	RewardVideoEnabled bool `json:"rewardVideoEnabled"`
	InterstitialEnabled bool `json:"interstitialEnabled"`
	BannerEnabled bool `json:"bannerEnabled"`
}
