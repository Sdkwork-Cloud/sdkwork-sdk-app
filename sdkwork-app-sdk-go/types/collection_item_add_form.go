package types

// 添加内容到合集表单
type CollectionItemAddForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Title string `json:"title"`
	Description string `json:"description"`
	Position int `json:"position"`
}
