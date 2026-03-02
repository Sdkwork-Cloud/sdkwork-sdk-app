package types

// 签到状态
type CheckInStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CheckedInToday bool `json:"checkedInToday"`
	ConsecutiveDays int `json:"consecutiveDays"`
	MonthlyCheckInCount int `json:"monthlyCheckInCount"`
	MonthlyCheckInDates []string `json:"monthlyCheckInDates"`
	MissedDates []string `json:"missedDates"`
	TodayReward CheckInReward `json:"todayReward"`
	TomorrowReward CheckInReward `json:"tomorrowReward"`
	MakeUpCost int `json:"makeUpCost"`
	RemainingMakeUpCount int `json:"remainingMakeUpCount"`
}
