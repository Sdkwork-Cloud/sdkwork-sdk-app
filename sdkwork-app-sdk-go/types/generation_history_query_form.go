package types

// 生成历史查询请求
type GenerationHistoryQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	GenerationType string `json:"generationType"`
	Status string `json:"status"`
	Keyword string `json:"keyword"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Size int `json:"size"`
	Page int `json:"page"`
}
