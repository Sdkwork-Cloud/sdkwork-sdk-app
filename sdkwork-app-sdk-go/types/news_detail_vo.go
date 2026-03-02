package types

// 新闻详情响应
type NewsDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NewsId string `json:"newsId"`
	Title string `json:"title"`
	Summary string `json:"summary"`
	Url string `json:"url"`
	Source string `json:"source"`
	CategoryId int `json:"categoryId"`
	Tags TagsContent `json:"tags"`
	PublishTime string `json:"publishTime"`
}
