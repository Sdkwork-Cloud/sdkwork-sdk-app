package types

// Drive item list query form
type DriveItemListForm struct {
	Keyword string `json:"keyword"`
	AssetType string `json:"assetType"`
	FolderId string `json:"folderId"`
	DiskId string `json:"diskId"`
	IncludeArchived bool `json:"includeArchived"`
	IncludeDeleted bool `json:"includeDeleted"`
	FavoriteOnly bool `json:"favoriteOnly"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
