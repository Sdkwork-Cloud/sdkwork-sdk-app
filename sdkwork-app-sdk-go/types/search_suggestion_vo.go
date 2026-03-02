package types

// 搜索建议响应
type SearchSuggestionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Keyword string `json:"keyword"`
	Type string `json:"type"`
	Count int `json:"count"`
}
