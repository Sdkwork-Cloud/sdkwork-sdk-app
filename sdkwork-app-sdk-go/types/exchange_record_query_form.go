package types

// 兑换记录查询请求
type ExchangeRecordQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Status string `json:"status"`
	Size int `json:"size"`
	Page int `json:"page"`
}
