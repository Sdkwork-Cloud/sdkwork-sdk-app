package types

// 补签结果
type CheckInMakeUpVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Date string `json:"date"`
	CostPoints int `json:"costPoints"`
	RemainingPoints int `json:"remainingPoints"`
	ConsecutiveDays int `json:"consecutiveDays"`
	Message string `json:"message"`
}
