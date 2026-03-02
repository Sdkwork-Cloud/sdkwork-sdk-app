package types

// 订单响应
type OrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId string `json:"orderId"`
	OrderSn string `json:"orderSn"`
	OrderType string `json:"orderType"`
	Subject string `json:"subject"`
	ProductImage string `json:"productImage"`
	Quantity int `json:"quantity"`
	TotalAmount string `json:"totalAmount"`
	PaidAmount string `json:"paidAmount"`
	PaidPointsAmount string `json:"paidPointsAmount"`
	DiscountAmount string `json:"discountAmount"`
	ShippingAmount string `json:"shippingAmount"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	RefundStatus string `json:"refundStatus"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentProvider string `json:"paymentProvider"`
	PayTime string `json:"payTime"`
	ExpireTime string `json:"expireTime"`
	Remark string `json:"remark"`
}
