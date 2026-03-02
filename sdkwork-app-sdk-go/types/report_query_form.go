package types

// 举报查询表单
type ReportQueryForm struct {
	Type string `json:"type"`
	Status string `json:"status"`
	Page int `json:"page"`
	Size int `json:"size"`
}
