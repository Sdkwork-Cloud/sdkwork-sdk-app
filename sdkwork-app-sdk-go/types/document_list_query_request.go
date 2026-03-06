package types

// List documents query request
type DocumentListQueryRequest struct {
	Keyword string `json:"keyword"`
	FolderId string `json:"folderId"`
	DiskId string `json:"diskId"`
	IncludeArchived bool `json:"includeArchived"`
	IncludeDeleted bool `json:"includeDeleted"`
	FavoriteOnly bool `json:"favoriteOnly"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
