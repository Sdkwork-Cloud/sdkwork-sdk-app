package types

// 反馈信息
type FeedbackVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	Content string `json:"content"`
	Status string `json:"status"`
	SubmitTime string `json:"submitTime"`
	ProcessTime string `json:"processTime"`
}
