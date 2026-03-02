package types

// 创建视频表单
type VideoCreateForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	Width int `json:"width"`
	Height int `json:"height"`
	CategoryId int `json:"categoryId"`
}
