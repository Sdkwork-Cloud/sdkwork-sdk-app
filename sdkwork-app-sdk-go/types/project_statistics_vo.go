package types

// 项目统计响应
type ProjectStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ProjectId string `json:"projectId"`
	TotalFiles int `json:"totalFiles"`
	TotalMembers int `json:"totalMembers"`
	TotalConversations int `json:"totalConversations"`
	DocumentCount int `json:"documentCount"`
	TagCount int `json:"tagCount"`
	LastActivityTime string `json:"lastActivityTime"`
	ActivityStats map[string]int `json:"activityStats"`
	DocumentTypeStats map[string]int `json:"documentTypeStats"`
}
