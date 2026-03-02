package types

// 我的审核记录查询请求
type MyAuditRecordQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	ContentType string `json:"contentType"`
	Result string `json:"result"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	Size int `json:"size"`
	Page int `json:"page"`
}
