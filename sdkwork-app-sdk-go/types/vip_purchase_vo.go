package types

// VIP购买响应
type VipPurchaseVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId string `json:"orderId"`
	PackId int `json:"packId"`
	PackName string `json:"packName"`
	Amount float64 `json:"amount"`
	DurationDays int `json:"durationDays"`
	TargetLevelId int `json:"targetLevelId"`
	TargetLevelName string `json:"targetLevelName"`
	Status string `json:"status"`
}
