package types

// 审核记录查询请求
type AuditRecordQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	ContentType string `json:"contentType"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	CheckTypes []string `json:"checkTypes"`
	Keyword string `json:"keyword"`
	Size int `json:"size"`
	Page int `json:"page"`
}
