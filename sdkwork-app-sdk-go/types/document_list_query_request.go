package types

// List documents query request
type DocumentListQueryRequest struct {
	Keyword string `json:"keyword"`
	FolderId string `json:"folderId"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
