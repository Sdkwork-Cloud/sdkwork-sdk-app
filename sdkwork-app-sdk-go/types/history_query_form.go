package types

// 交易记录查询请求
type HistoryQueryForm struct {
	TransactionType string `json:"transactionType"`
	Status string `json:"status"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
}
