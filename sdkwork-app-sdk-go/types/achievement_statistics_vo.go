package types

// 成就统计
type AchievementStatisticsVO struct {
	TotalAchievements int `json:"totalAchievements"`
	UnlockedAchievements int `json:"unlockedAchievements"`
	CompletionRate float64 `json:"completionRate"`
	TotalPoints int `json:"totalPoints"`
	RecentAchievements []AchievementVO `json:"recentAchievements"`
}
