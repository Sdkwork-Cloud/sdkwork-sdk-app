package types

// 举报信息
type ReportVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	Status string `json:"status"`
	SubmitTime string `json:"submitTime"`
	ProcessTime string `json:"processTime"`
}
