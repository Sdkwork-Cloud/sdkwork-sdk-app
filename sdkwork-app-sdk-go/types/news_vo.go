package types

// 新闻响应
type NewsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NewsId string `json:"newsId"`
	Title string `json:"title"`
	Summary string `json:"summary"`
	Url string `json:"url"`
	Source string `json:"source"`
	CategoryId int `json:"categoryId"`
	PublishTime string `json:"publishTime"`
}
