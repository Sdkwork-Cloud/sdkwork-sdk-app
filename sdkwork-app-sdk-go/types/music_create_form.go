package types

// 创建音乐表单
type MusicCreateForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	Artist string `json:"artist"`
	Genre string `json:"genre"`
}
