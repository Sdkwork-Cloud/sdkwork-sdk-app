package types

// 支持信息
type SupportInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Hotline string `json:"hotline"`
	Email string `json:"email"`
	WorkingHours string `json:"workingHours"`
	WechatQrcode string `json:"wechatQrcode"`
	OnlineSupportUrl string `json:"onlineSupportUrl"`
	FaqUrl string `json:"faqUrl"`
	HelpCenterUrl string `json:"helpCenterUrl"`
}
