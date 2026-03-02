package types

// 事件统计查询请求
type EventStatsQueryForm struct {
	EventName string `json:"eventName"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	Interval string `json:"interval"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
}
