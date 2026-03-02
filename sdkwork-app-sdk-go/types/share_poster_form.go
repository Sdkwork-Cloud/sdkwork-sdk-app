package types

// 生成分享海报请求
type SharePosterForm struct {
	ShareType string `json:"shareType"`
	ShareId string `json:"shareId"`
	Template string `json:"template"`
	BackgroundColor string `json:"backgroundColor"`
	TextColor string `json:"textColor"`
	IncludeQrCode bool `json:"includeQrCode"`
	CustomText string `json:"customText"`
}
