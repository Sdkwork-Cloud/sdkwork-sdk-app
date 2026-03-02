package types

// 快捷方式响应
type ShortcutVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Icon string `json:"icon"`
	Url string `json:"url"`
	Type string `json:"type"`
	Sort int `json:"sort"`
	Group string `json:"group"`
	Description string `json:"description"`
	IsDefault bool `json:"isDefault"`
	Enabled bool `json:"enabled"`
	UsageCount int `json:"usageCount"`
	LastUsedAt string `json:"lastUsedAt"`
}
