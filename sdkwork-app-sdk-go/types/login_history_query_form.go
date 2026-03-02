package types

// 登录历史查询请求
type LoginHistoryQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	LoginType string `json:"loginType"`
	DeviceType string `json:"deviceType"`
	Status string `json:"status"`
	IpAddress string `json:"ipAddress"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Size int `json:"size"`
	Page int `json:"page"`
}
