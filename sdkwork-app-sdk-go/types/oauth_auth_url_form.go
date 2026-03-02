package types

// 获取OAuth授权URL请求
type OAuthAuthUrlForm struct {
	Provider string `json:"provider"`
	RedirectUri string `json:"redirectUri"`
	Scope string `json:"scope"`
	State string `json:"state"`
}
