package types

// 渠道分析VO
type ChannelAnalysisVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ChannelId string `json:"channelId"`
	ChannelName string `json:"channelName"`
	ChannelType string `json:"channelType"`
	ClickCount int `json:"clickCount"`
	InstallCount int `json:"installCount"`
	ActiveCount int `json:"activeCount"`
	ConversionRate float64 `json:"conversionRate"`
	CostPerInstall float64 `json:"costPerInstall"`
	Roi float64 `json:"roi"`
}
