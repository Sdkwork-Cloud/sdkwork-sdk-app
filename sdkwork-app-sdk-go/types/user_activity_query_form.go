package types

// 用户活动查询请求
type UserActivityQueryForm struct {
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	ActivityType string `json:"activityType"`
	UserId string `json:"userId"`
	PageSize int `json:"pageSize"`
	PageNum int `json:"pageNum"`
}
