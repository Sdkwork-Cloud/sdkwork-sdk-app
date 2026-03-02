package types

// 更新新闻表单
type NewsUpdateForm struct {
	Title string `json:"title"`
	Summary string `json:"summary"`
	Url string `json:"url"`
	Source string `json:"source"`
}
