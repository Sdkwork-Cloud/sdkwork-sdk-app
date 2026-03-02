package types

// 笔记列表查询请求
type NoteListQueryRequest struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
	FolderId string `json:"folderId"`
	Keyword string `json:"keyword"`
}
