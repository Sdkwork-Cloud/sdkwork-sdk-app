package types

// 事件趋势查询请求
type EventTrendQueryForm struct {
	EventName string `json:"eventName"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	Interval string `json:"interval"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
	Channel string `json:"channel"`
}
