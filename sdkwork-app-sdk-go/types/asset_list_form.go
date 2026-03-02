package types

// 资产列表查询请求
type AssetListForm struct {
	Type string `json:"type"`
	FolderId string `json:"folderId"`
	Keyword string `json:"keyword"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
