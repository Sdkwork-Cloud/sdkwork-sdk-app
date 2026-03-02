package types


type OperationHistoryQueryForm struct {
	Action string `json:"action"`
	Result string `json:"result"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
}
