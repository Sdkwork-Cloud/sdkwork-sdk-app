package types


type AdvancedSearchRequest struct {
	Keyword string `json:"keyword"`
	Type string `json:"type"`
	Filters map[string]interface{} `json:"filters"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
