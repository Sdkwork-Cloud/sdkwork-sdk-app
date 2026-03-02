package types

// VIP积分历史响应
type VipPointsHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	ChangeType string `json:"changeType"`
	ChangeAmount int `json:"changeAmount"`
	BeforeBalance int `json:"beforeBalance"`
	AfterBalance int `json:"afterBalance"`
	SourceType string `json:"sourceType"`
	Remark string `json:"remark"`
}
