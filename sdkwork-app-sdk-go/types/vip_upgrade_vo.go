package types

// VIP升级信息
type VipUpgradeVO struct {
	Price string `json:"price"`
	TargetLevel string `json:"targetLevel"`
	UpgradeUrl string `json:"upgradeUrl"`
	Discount string `json:"discount"`
}
