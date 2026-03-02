package types


type UserSearchRequest struct {
	Keyword string `json:"keyword"`
	UserType string `json:"userType"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
