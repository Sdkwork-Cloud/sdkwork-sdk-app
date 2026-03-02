package types

// VIP权益响应
type VipBenefitVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	BenefitKey string `json:"benefitKey"`
	Type string `json:"type"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Claimed bool `json:"claimed"`
	UsageLimit int `json:"usageLimit"`
	UsedCount int `json:"usedCount"`
}
