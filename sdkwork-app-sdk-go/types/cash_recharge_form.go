package types

// 现金充值请求
type CashRechargeForm struct {
	Amount float64 `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
	Remarks string `json:"remarks"`
	CouponId string `json:"couponId"`
}
