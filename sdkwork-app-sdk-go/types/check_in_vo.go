package types

// 签到结果
type CheckInVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	CheckInDate string `json:"checkInDate"`
	ConsecutiveDays int `json:"consecutiveDays"`
	Points int `json:"points"`
	ExtraRewards map[string]interface{} `json:"extraRewards"`
	CheckedInToday bool `json:"checkedInToday"`
	Message string `json:"message"`
}
