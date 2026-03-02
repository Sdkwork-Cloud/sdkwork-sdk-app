package types


type CouponStatisticsVO struct {
	TotalCoupons int `json:"totalCoupons"`
	UnusedCount int `json:"unusedCount"`
	UsedCount int `json:"usedCount"`
	ExpiredCount int `json:"expiredCount"`
}
