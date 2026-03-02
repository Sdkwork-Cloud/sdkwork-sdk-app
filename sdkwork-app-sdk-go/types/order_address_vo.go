package types

// 订单地址
type OrderAddressVO struct {
	Recipient string `json:"recipient"`
	Phone string `json:"phone"`
	Address string `json:"address"`
}
