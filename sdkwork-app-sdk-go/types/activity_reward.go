package types

// 活动奖励
type ActivityReward struct {
	Type string `json:"type"`
	Name string `json:"name"`
	Quantity int `json:"quantity"`
	Icon string `json:"icon"`
}
