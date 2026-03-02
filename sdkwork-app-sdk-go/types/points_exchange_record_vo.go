package types

// 积分兑换记录
type PointsExchangeRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	GoodsId string `json:"goodsId"`
	GoodsName string `json:"goodsName"`
	GoodsImage string `json:"goodsImage"`
	Quantity int `json:"quantity"`
	PointsCost int `json:"pointsCost"`
	ExchangeTime string `json:"exchangeTime"`
	Status string `json:"status"`
	DeliverTime string `json:"deliverTime"`
	LogisticsInfo string `json:"logisticsInfo"`
	Remark string `json:"remark"`
}
