package types


type ProjectSearchRequest struct {
	Keyword string `json:"keyword"`
	WorkspaceId string `json:"workspaceId"`
	Type string `json:"type"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
