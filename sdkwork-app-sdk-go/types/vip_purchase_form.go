package types

// VIP购买请求
type VipPurchaseForm struct {
	PackId int `json:"packId"`
	CouponId string `json:"couponId"`
	PaymentMethod string `json:"paymentMethod"`
}
