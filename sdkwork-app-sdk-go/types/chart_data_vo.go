package types

// 图表数据响应
type ChartDataVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Type string `json:"type"`
	Title string `json:"title"`
	Labels []string `json:"labels"`
	Datasets []DatasetVO `json:"datasets"`
	Config ChartConfigVO `json:"config"`
}
