package types

// 任务奖励
type TaskRewardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RewardId string `json:"rewardId"`
	TaskId string `json:"taskId"`
	RewardType string `json:"rewardType"`
	RewardAmount int `json:"rewardAmount"`
	Status string `json:"status"`
	Message string `json:"message"`
	ClaimedAt string `json:"claimedAt"`
}
