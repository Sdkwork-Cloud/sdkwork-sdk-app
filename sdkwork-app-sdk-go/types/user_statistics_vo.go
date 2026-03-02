package types

// 用户统计响应
type UserStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	Username string `json:"username"`
	Avatar string `json:"avatar"`
	RegisteredAt string `json:"registeredAt"`
	LastLoginAt string `json:"lastLoginAt"`
	LoginCount int `json:"loginCount"`
	TotalUsageTime int `json:"totalUsageTime"`
	TotalGenerations int `json:"totalGenerations"`
	TotalProjects int `json:"totalProjects"`
	TotalFiles int `json:"totalFiles"`
	TotalStorage int `json:"totalStorage"`
	Level UserLevelVO `json:"level"`
	VipInfo VipStatisticsVO `json:"vipInfo"`
	AchievementStats AchievementStatisticsVO `json:"achievementStats"`
	UsageStats UsageStatisticsVO `json:"usageStats"`
	GenerationStats GenerationStatisticsVO `json:"generationStats"`
}
