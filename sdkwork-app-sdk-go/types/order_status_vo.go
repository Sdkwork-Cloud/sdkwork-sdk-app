package types


type OrderStatusVO struct {
	OrderId string `json:"orderId"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	ExpireTime int `json:"expireTime"`
}
