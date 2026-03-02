package types

// OAuth授权URL响应
type OAuthUrlVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AuthUrl string `json:"authUrl"`
}
