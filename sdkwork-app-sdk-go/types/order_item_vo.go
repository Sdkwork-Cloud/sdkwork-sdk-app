package types

// 订单商品项
type OrderItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	OrderId string `json:"orderId"`
	CategoryId string `json:"categoryId"`
	ProductType string `json:"productType"`
	ProductId string `json:"productId"`
	SkuId string `json:"skuId"`
	ProductName string `json:"productName"`
	ProductImage string `json:"productImage"`
	Quantity int `json:"quantity"`
	UnitPrice string `json:"unitPrice"`
	TotalAmount string `json:"totalAmount"`
	DiscountAmount string `json:"discountAmount"`
	PaidAmount string `json:"paidAmount"`
	RefundedAmount string `json:"refundedAmount"`
	SkuSpec string `json:"skuSpec"`
	Currency string `json:"currency"`
	RefundStatus string `json:"refundStatus"`
	ReviewStatus string `json:"reviewStatus"`
	PaymentProvider string `json:"paymentProvider"`
	PaymentProductType string `json:"paymentProductType"`
	ExpireTime string `json:"expireTime"`
}
