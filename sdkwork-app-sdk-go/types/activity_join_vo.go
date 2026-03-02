package types

// 活动参与结果
type ActivityJoinVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	Success bool `json:"success"`
	Result string `json:"result"`
	Rewards map[string]interface{} `json:"rewards"`
	RemainingCount int `json:"remainingCount"`
	Message string `json:"message"`
}
