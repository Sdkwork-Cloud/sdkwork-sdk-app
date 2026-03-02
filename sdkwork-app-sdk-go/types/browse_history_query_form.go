package types


type BrowseHistoryQueryForm struct {
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
}
