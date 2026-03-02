package types

// VIP优惠券响应
type VipCouponVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Discount float64 `json:"discount"`
	MinAmount float64 `json:"minAmount"`
	ReduceAmount float64 `json:"reduceAmount"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	Status string `json:"status"`
	Used bool `json:"used"`
}
