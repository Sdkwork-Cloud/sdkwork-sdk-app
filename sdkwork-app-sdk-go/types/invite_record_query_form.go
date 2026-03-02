package types

// 查询邀请记录请求
type InviteRecordQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Status string `json:"status"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
