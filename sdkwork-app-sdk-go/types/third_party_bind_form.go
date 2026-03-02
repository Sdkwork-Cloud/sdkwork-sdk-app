package types

// 第三方绑定请求
type ThirdPartyBindForm struct {
	Platform string `json:"platform"`
	Code string `json:"code"`
	ThirdPartyUserId string `json:"thirdPartyUserId"`
	ThirdPartyUserName string `json:"thirdPartyUserName"`
	ThirdPartyAvatar string `json:"thirdPartyAvatar"`
	AccessToken string `json:"accessToken"`
	RefreshToken string `json:"refreshToken"`
	ExpireTime string `json:"expireTime"`
}
