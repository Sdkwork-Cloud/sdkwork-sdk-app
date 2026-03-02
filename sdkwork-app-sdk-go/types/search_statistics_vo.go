package types

// 搜索统计响应
type SearchStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalSearches int `json:"totalSearches"`
	TodaySearches int `json:"todaySearches"`
	ThisWeekSearches int `json:"thisWeekSearches"`
	ThisMonthSearches int `json:"thisMonthSearches"`
	HotKeywords map[string]int `json:"hotKeywords"`
	TypeDistribution map[string]int `json:"typeDistribution"`
	LastSearchTime string `json:"lastSearchTime"`
}
