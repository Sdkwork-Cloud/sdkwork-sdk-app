package types

// 创建新闻表单
type NewsCreateForm struct {
	Title string `json:"title"`
	Summary string `json:"summary"`
	Url string `json:"url"`
	Source string `json:"source"`
	CategoryId int `json:"categoryId"`
}
