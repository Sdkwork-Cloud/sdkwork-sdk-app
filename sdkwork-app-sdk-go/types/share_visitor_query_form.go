package types

// 查询分享访客请求
type ShareVisitorQueryForm struct {
	ShareId string `json:"shareId"`
	Page int `json:"page"`
	Size int `json:"size"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
