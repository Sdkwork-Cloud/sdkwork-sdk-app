package types

// VIP统计响应
type VipStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Status string `json:"status"`
	Level string `json:"level"`
	StartedAt string `json:"startedAt"`
	ExpiredAt string `json:"expiredAt"`
	RemainingDays int `json:"remainingDays"`
	TotalDays int `json:"totalDays"`
	Privileges []VipPrivilegeVO `json:"privileges"`
	RenewalInfo VipRenewalVO `json:"renewalInfo"`
	UpgradeInfo VipUpgradeVO `json:"upgradeInfo"`
}
