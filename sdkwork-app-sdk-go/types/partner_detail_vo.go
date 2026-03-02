package types

// 合作伙伴详情响应
type PartnerDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PartnerId string `json:"partnerId"`
	Name string `json:"name"`
	Level string `json:"level"`
	Status string `json:"status"`
	PromotionCode string `json:"promotionCode"`
	ContactName string `json:"contactName"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	CompanyAddress string `json:"companyAddress"`
	BusinessLicense string `json:"businessLicense"`
	SettlementAccount string `json:"settlementAccount"`
	CommissionRate float64 `json:"commissionRate"`
	TotalCommission float64 `json:"totalCommission"`
	WithdrawableCommission float64 `json:"withdrawableCommission"`
	WithdrawnCommission float64 `json:"withdrawnCommission"`
	ParentId int `json:"parentId"`
	CooperationStartTime string `json:"cooperationStartTime"`
	CooperationEndTime string `json:"cooperationEndTime"`
	Remark string `json:"remark"`
}
