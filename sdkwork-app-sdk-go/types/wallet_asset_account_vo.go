package types

// 钱包资产账户信息
type WalletAssetAccountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccountId string `json:"accountId"`
	AccountType string `json:"accountType"`
	AccountTypeName string `json:"accountTypeName"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	AvailableBalance float64 `json:"availableBalance"`
	FrozenBalance float64 `json:"frozenBalance"`
	AvailablePoints int `json:"availablePoints"`
	FrozenPoints int `json:"frozenPoints"`
	AvailableToken int `json:"availableToken"`
	FrozenToken int `json:"frozenToken"`
}
