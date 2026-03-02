package types

// 优惠券响应
type CouponVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CouponId string `json:"couponId"`
	Name string `json:"name"`
	Type string `json:"type"`
	TypeName string `json:"typeName"`
	Description string `json:"description"`
	Amount int `json:"amount"`
	Discount float64 `json:"discount"`
	MinConsume int `json:"minConsume"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Total int `json:"total"`
	GetLimit int `json:"getLimit"`
	ReceivedCount int `json:"receivedCount"`
	UsedCount int `json:"usedCount"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	Stackable bool `json:"stackable"`
	ScopeType int `json:"scopeType"`
	ScopeValue string `json:"scopeValue"`
	RemainingCount int `json:"remainingCount"`
	CanReceive bool `json:"canReceive"`
}
