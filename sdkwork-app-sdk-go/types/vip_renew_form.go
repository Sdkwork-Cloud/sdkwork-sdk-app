package types

// VIP续费请求
type VipRenewForm struct {
	Duration int `json:"duration"`
	PackId int `json:"packId"`
	CouponId string `json:"couponId"`
	PaymentMethod string `json:"paymentMethod"`
}
