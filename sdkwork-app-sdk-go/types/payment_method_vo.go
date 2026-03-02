package types

// 支付方式响应
type PaymentMethodVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Code string `json:"code"`
	MethodId string `json:"methodId"`
	MethodName string `json:"methodName"`
	MethodIcon string `json:"methodIcon"`
	Enabled bool `json:"enabled"`
	Sort int `json:"sort"`
	Icon string `json:"icon"`
	Available bool `json:"available"`
	ProductTypes []PaymentProductTypeVO `json:"productTypes"`
}
