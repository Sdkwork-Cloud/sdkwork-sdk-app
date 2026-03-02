package types

// 订单详情响应
type OrderDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId string `json:"orderId"`
	OrderSn string `json:"orderSn"`
	OrderType string `json:"orderType"`
	OrderTypeName string `json:"orderTypeName"`
	Subject string `json:"subject"`
	ProductId string `json:"productId"`
	ProductImage string `json:"productImage"`
	Quantity int `json:"quantity"`
	ProductAmount string `json:"productAmount"`
	ShippingAmount string `json:"shippingAmount"`
	DiscountAmount string `json:"discountAmount"`
	TaxAmount string `json:"taxAmount"`
	TotalAmount string `json:"totalAmount"`
	PaidAmount string `json:"paidAmount"`
	PaidPointsAmount string `json:"paidPointsAmount"`
	RefundedAmount string `json:"refundedAmount"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	RefundStatus string `json:"refundStatus"`
	RefundStatusName string `json:"refundStatusName"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentProvider string `json:"paymentProvider"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	Currency string `json:"currency"`
	PayTime string `json:"payTime"`
	ExpireTime string `json:"expireTime"`
	CompleteTime string `json:"completeTime"`
	CancelTime string `json:"cancelTime"`
	Remark string `json:"remark"`
	MerchantRemark string `json:"merchantRemark"`
	SourceChannel string `json:"sourceChannel"`
	UserId int `json:"userId"`
	Username string `json:"username"`
	Email string `json:"email"`
	ReceiverName string `json:"receiverName"`
	ReceiverPhone string `json:"receiverPhone"`
	ReceiverAddress string `json:"receiverAddress"`
	LogisticsCompany string `json:"logisticsCompany"`
	LogisticsNo string `json:"logisticsNo"`
	DeliverTime string `json:"deliverTime"`
	CouponInfo CouponInfoVO `json:"couponInfo"`
	Items []OrderItemVO `json:"items"`
	Address OrderAddressVO `json:"address"`
}
