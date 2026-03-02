package types

// 合作伙伴响应
type PartnerVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PartnerId string `json:"partnerId"`
	Name string `json:"name"`
	Level string `json:"level"`
	Status string `json:"status"`
	PromotionCode string `json:"promotionCode"`
	ContactName string `json:"contactName"`
	ContactPhone string `json:"contactPhone"`
	TotalCommission float64 `json:"totalCommission"`
	WithdrawableCommission float64 `json:"withdrawableCommission"`
}
