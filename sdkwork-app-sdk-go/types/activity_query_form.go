package types

// 活动查询请求
type ActivityQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Type string `json:"type"`
	Status string `json:"status"`
	Size int `json:"size"`
	Page int `json:"page"`
}
