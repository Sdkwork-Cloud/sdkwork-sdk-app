package types


type NoteSearchRequest struct {
	Keyword string `json:"keyword"`
	FolderId string `json:"folderId"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
