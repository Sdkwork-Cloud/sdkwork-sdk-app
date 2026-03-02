package types

// 查询订单列表请求
type OrderListQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Status string `json:"status"`
	OrderType string `json:"orderType"`
	Keyword string `json:"keyword"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
