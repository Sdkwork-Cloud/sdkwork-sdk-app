package types

// 查询分享请求
type ShareQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	ShareType string `json:"shareType"`
	Status string `json:"status"`
	Keyword string `json:"keyword"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
