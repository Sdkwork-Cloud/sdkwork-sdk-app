package types

// 支付产品类型
type PaymentProductTypeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Code string `json:"code"`
	Name string `json:"name"`
	Available bool `json:"available"`
}
