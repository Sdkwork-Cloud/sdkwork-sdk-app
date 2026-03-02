package types

// VIP续费信息
type VipRenewalVO struct {
	Price string `json:"price"`
	Period string `json:"period"`
	RenewalUrl string `json:"renewalUrl"`
	AutoRenew bool `json:"autoRenew"`
}
