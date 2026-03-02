package types

// 租户统计响应
type TenantStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalTenants int `json:"totalTenants"`
	ActiveTenants int `json:"activeTenants"`
	FrozenTenants int `json:"frozenTenants"`
	ClosedTenants int `json:"closedTenants"`
}
