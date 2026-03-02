package types

// 通知查询表单
type NotificationQueryForm struct {
	Type string `json:"type"`
	Read bool `json:"read"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortBy string `json:"sortBy"`
	SortDirection string `json:"sortDirection"`
}
