package types

// 登录响应
type LoginVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AuthToken string `json:"authToken"`
	RefreshToken string `json:"refreshToken"`
	TokenType string `json:"tokenType"`
	ExpiresIn int `json:"expiresIn"`
	UserInfo UserInfoVO `json:"userInfo"`
}
