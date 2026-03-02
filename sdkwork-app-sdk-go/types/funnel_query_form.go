package types

// 漏斗查询请求
type FunnelQueryForm struct {
	FunnelName string `json:"funnelName"`
	Events []string `json:"events"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
}
