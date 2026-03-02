package types

// 敏感词库响应
type SensitiveWordListVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ListId string `json:"listId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	WordCount int `json:"wordCount"`
	Categories []string `json:"categories"`
	Version string `json:"version"`
	Enabled bool `json:"enabled"`
}
