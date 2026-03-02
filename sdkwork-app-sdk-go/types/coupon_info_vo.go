package types

// 优惠券信息
type CouponInfoVO struct {
	CouponId string `json:"couponId"`
	CouponName string `json:"couponName"`
	DiscountAmount string `json:"discountAmount"`
	CouponType string `json:"couponType"`
}
