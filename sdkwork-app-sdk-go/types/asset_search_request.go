package types


type AssetSearchRequest struct {
	Keyword string `json:"keyword"`
	Type string `json:"type"`
	WorkspaceId string `json:"workspaceId"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
