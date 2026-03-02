package types

// VIP信息响应
type VipInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VipLevel int `json:"vipLevel"`
	VipLevelName string `json:"vipLevelName"`
	VipStatus string `json:"vipStatus"`
	EffectiveTime string `json:"effectiveTime"`
	ExpireTime string `json:"expireTime"`
	RemainingDays int `json:"remainingDays"`
	TotalDays int `json:"totalDays"`
	TotalSpent int `json:"totalSpent"`
	VipPoints int `json:"vipPoints"`
	GrowthValue int `json:"growthValue"`
	UpgradeGrowthValue int `json:"upgradeGrowthValue"`
	CustomerService CustomerServiceInfo `json:"customerService"`
	Benefits []VipBenefitVO `json:"benefits"`
	Coupons []VipCouponVO `json:"coupons"`
}
