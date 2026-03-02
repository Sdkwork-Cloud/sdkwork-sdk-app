package types

// 积分兑换请求
type PointsExchangeForm struct {
	Quantity int `json:"quantity"`
	AddressId string `json:"addressId"`
	Remark string `json:"remark"`
}
