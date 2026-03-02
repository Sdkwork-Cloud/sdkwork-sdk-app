package types

// 更新笔记请求
type NoteUpdateRequest struct {
	Title string `json:"title"`
	Content string `json:"content"`
	Tags []string `json:"tags"`
}
