package types

// 渠道查询请求
type ChannelQueryForm struct {
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	ChannelType string `json:"channelType"`
	DeviceType string `json:"deviceType"`
	PageSize int `json:"pageSize"`
	PageNum int `json:"pageNum"`
}
