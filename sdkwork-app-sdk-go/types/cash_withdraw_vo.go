package types

// 现金提现响应
type CashWithdrawVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TransactionId string `json:"transactionId"`
	AccountId string `json:"accountId"`
	Amount float64 `json:"amount"`
	BalanceAfter float64 `json:"balanceAfter"`
	FrozenBalance float64 `json:"frozenBalance"`
	Status string `json:"status"`
	EstimatedArrivalTime string `json:"estimatedArrivalTime"`
	WithdrawMethod string `json:"withdrawMethod"`
}
