package types

// 查询提示语请求
type PromptQueryForm struct {
	Keyword string `json:"keyword"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Enabled bool `json:"enabled"`
	Model string `json:"model"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortBy string `json:"sortBy"`
	SortDirection string `json:"sortDirection"`
}
