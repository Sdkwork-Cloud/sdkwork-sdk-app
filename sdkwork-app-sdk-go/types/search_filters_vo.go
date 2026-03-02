package types

// 搜索筛选条件响应
type SearchFiltersVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TypeFilters map[string]string `json:"typeFilters"`
	DateFilters map[string]string `json:"dateFilters"`
	OtherFilters map[string]interface{} `json:"otherFilters"`
}
