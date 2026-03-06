package types

// 兑换优惠券请求
type CouponRedeemForm struct {
	RedeemCode string `json:"redeemCode"`
	Channel string `json:"channel"`
}
