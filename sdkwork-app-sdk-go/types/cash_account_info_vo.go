package types

// 现金账户信息响应
type CashAccountInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccountId string `json:"accountId"`
	AccountType string `json:"accountType"`
	AccountTypeName string `json:"accountTypeName"`
	OwnerId string `json:"ownerId"`
	UserId string `json:"userId"`
	AvailableBalance float64 `json:"availableBalance"`
	FrozenBalance float64 `json:"frozenBalance"`
	TotalBalance float64 `json:"totalBalance"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	PendingBalance float64 `json:"pendingBalance"`
	TotalRecharged float64 `json:"totalRecharged"`
	TotalSpent float64 `json:"totalSpent"`
	TotalWithdrawn float64 `json:"totalWithdrawn"`
}
