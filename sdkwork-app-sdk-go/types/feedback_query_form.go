package types

// 反馈查询表单
type FeedbackQueryForm struct {
	Type string `json:"type"`
	Status string `json:"status"`
	Page int `json:"page"`
	Size int `json:"size"`
}
