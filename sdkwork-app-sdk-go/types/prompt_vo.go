package types

// AI提示语响应
type PromptVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Description string `json:"description"`
	CateId int `json:"cateId"`
	Enabled bool `json:"enabled"`
	Sort int `json:"sort"`
	Parameters map[string]interface{} `json:"parameters"`
	Creator string `json:"creator"`
	Model string `json:"model"`
	Tags TagsContent `json:"tags"`
	UsageCount int `json:"usageCount"`
	AvgResponseTime int `json:"avgResponseTime"`
	Version string `json:"version"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	FavoriteCount int `json:"favoriteCount"`
	LastUsedAt string `json:"lastUsedAt"`
}
