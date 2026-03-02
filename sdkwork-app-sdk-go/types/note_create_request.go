package types

// 创建笔记请求
type NoteCreateRequest struct {
	Title string `json:"title"`
	Content string `json:"content"`
	FolderId string `json:"folderId"`
	Tags []string `json:"tags"`
}
