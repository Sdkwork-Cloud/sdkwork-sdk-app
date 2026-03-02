package types

// 积分商品详情
type PointsGoodsDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Images []string `json:"images"`
	Category string `json:"category"`
	Points int `json:"points"`
	OriginalPoints int `json:"originalPoints"`
	Stock int `json:"stock"`
	Exchangeable bool `json:"exchangeable"`
	LimitPerUser int `json:"limitPerUser"`
	MyExchangedCount int `json:"myExchangedCount"`
	ExchangeNote string `json:"exchangeNote"`
	ValidUntil string `json:"validUntil"`
	UsageInstructions string `json:"usageInstructions"`
}
