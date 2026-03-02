package types

// 复制笔记请求
type NoteCopyRequest struct {
	FolderId string `json:"folderId"`
	Title string `json:"title"`
}
