package types

// 首页仪表盘响应
type HomeDashboardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserInfo UserInfoVO `json:"userInfo"`
	Statistics StatisticsVO `json:"statistics"`
	Shortcuts []ShortcutVO `json:"shortcuts"`
	RecentActivities []RecentActivityVO `json:"recentActivities"`
	RecentProjects []RecentProjectVO `json:"recentProjects"`
	TodoItems []TodoItemVO `json:"todoItems"`
	Recommendations []RecommendationVO `json:"recommendations"`
	TrendingItems []TrendingItemVO `json:"trendingItems"`
	Achievements []AchievementVO `json:"achievements"`
	Notifications []PopupNotificationVO `json:"notifications"`
	ChartData []ChartDataVO `json:"chartData"`
}
