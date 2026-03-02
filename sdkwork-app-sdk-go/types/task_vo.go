package types

// 任务信息
type TaskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	TaskName string `json:"taskName"`
	TaskType string `json:"taskType"`
	Status string `json:"status"`
	Progress int `json:"progress"`
	Total int `json:"total"`
	RewardType string `json:"rewardType"`
	RewardAmount int `json:"rewardAmount"`
	ExpireAt string `json:"expireAt"`
}
