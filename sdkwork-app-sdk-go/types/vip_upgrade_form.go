package types

// VIP升级请求
type VipUpgradeForm struct {
	TargetLevelId int `json:"targetLevelId"`
	CouponId string `json:"couponId"`
	PaymentMethod string `json:"paymentMethod"`
}
