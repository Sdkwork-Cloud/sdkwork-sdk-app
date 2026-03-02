package types

// 签到记录
type CheckInRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Date string `json:"date"`
	CheckedIn bool `json:"checkedIn"`
	IsMakeUp bool `json:"isMakeUp"`
	Points int `json:"points"`
	ConsecutiveDays int `json:"consecutiveDays"`
	ExtraRewards map[string]interface{} `json:"extraRewards"`
}
