package types


type ProjectListQueryRequest struct {
	Keyword string `json:"keyword"`
	WorkspaceId string `json:"workspaceId"`
	Type string `json:"type"`
	Status string `json:"status"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
