package types

// 用户优惠券响应
type UserCouponVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserCouponId string `json:"userCouponId"`
	CouponId string `json:"couponId"`
	CouponName string `json:"couponName"`
	CouponCode string `json:"couponCode"`
	Type string `json:"type"`
	TypeName string `json:"typeName"`
	Amount int `json:"amount"`
	Discount float64 `json:"discount"`
	MinConsume int `json:"minConsume"`
	AcquireAt string `json:"acquireAt"`
	AcquireRequestNo string `json:"acquireRequestNo"`
	AcquireType string `json:"acquireType"`
	PointCost int `json:"pointCost"`
	PointsRefunded bool `json:"pointsRefunded"`
	PointsRefundAt string `json:"pointsRefundAt"`
	UseAt string `json:"useAt"`
	ExpireAt string `json:"expireAt"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	OrderId string `json:"orderId"`
	CanShared bool `json:"canShared"`
	Available bool `json:"available"`
	RemainingDays int `json:"remainingDays"`
}
