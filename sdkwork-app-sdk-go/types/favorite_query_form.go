package types

// 查询收藏请求
type FavoriteQueryForm struct {
	FavoriteType string `json:"favoriteType"`
	Type string `json:"type"`
	FolderId string `json:"folderId"`
	Keyword string `json:"keyword"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
