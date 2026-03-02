package types

// 搜索历史响应
type SearchHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Keyword string `json:"keyword"`
	SearchTime string `json:"searchTime"`
	Count int `json:"count"`
}
