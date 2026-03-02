package types

// 签到奖励
type CheckInReward struct {
	Points int `json:"points"`
	ExtraReward string `json:"extraReward"`
}
