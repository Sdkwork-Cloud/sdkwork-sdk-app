package types

// 查询关注列表请求
type FollowQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	QueryType string `json:"queryType"`
	UserId string `json:"userId"`
	Keyword string `json:"keyword"`
}
