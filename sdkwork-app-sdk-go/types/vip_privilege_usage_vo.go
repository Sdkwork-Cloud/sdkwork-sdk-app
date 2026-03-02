package types

// VIP特权使用情况响应
type VipPrivilegeUsageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	SpeedUpUsed int `json:"speedUpUsed"`
	SpeedUpLimit int `json:"speedUpLimit"`
	PriorityQueueUsed int `json:"priorityQueueUsed"`
	PriorityQueueLimit int `json:"priorityQueueLimit"`
	ExclusiveModelUsed int `json:"exclusiveModelUsed"`
	ExclusiveModelLimit int `json:"exclusiveModelLimit"`
}
