package types

// 积分兑换结果
type PointsExchangeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	Success bool `json:"success"`
	GoodsName string `json:"goodsName"`
	PointsCost int `json:"pointsCost"`
	RemainingPoints int `json:"remainingPoints"`
	Quantity int `json:"quantity"`
	ExchangeTime string `json:"exchangeTime"`
	Status string `json:"status"`
	RewardContent string `json:"rewardContent"`
	Message string `json:"message"`
}
