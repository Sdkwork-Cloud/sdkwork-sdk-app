package types

// 合作伙伴统计响应
type PartnerStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalPartners int `json:"totalPartners"`
	ActivePartners int `json:"activePartners"`
	PendingPartners int `json:"pendingPartners"`
	TotalCommission float64 `json:"totalCommission"`
	WithdrawableCommission float64 `json:"withdrawableCommission"`
}
