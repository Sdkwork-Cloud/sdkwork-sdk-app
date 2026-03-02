package types

// 实时在线VO
type RealtimeOnlineVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CurrentOnline int `json:"currentOnline"`
	PeakOnline int `json:"peakOnline"`
	AverageOnline int `json:"averageOnline"`
	NewUsers int `json:"newUsers"`
	ActiveUsers int `json:"activeUsers"`
	Timestamp string `json:"timestamp"`
}
