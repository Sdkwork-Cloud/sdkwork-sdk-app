package types

// 用户使用统计VO
type UserUsageStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StatsId string `json:"statsId"`
	UserId string `json:"userId"`
	TotalSessions int `json:"totalSessions"`
	TotalDuration int `json:"totalDuration"`
	ActiveDays int `json:"activeDays"`
	LastActiveDays int `json:"lastActiveDays"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
	FirstSeen string `json:"firstSeen"`
	LastSeen string `json:"lastSeen"`
	UserType string `json:"userType"`
}
