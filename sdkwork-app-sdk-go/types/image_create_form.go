package types

// 创建图片表单
type ImageCreateForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	Url string `json:"url"`
	Format string `json:"format"`
	Width int `json:"width"`
	Height int `json:"height"`
}
