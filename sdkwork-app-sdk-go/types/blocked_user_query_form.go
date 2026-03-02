package types

// 查询黑名单用户请求
type BlockedUserQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Keyword string `json:"keyword"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
