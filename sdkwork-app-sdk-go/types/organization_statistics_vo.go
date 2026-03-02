package types

// 组织统计响应
type OrganizationStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalOrganizations int `json:"totalOrganizations"`
	ActiveOrganizations int `json:"activeOrganizations"`
	TotalMembers int `json:"totalMembers"`
	TotalDepartments int `json:"totalDepartments"`
	TotalPositions int `json:"totalPositions"`
}
