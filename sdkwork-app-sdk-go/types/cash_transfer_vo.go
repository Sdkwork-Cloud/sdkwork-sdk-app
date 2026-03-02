package types

// 现金转账响应
type CashTransferVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TransactionId string `json:"transactionId"`
	FromAccountId string `json:"fromAccountId"`
	ToAccountId string `json:"toAccountId"`
	Amount float64 `json:"amount"`
	Status string `json:"status"`
	FromBalanceAfter float64 `json:"fromBalanceAfter"`
	ToBalanceAfter float64 `json:"toBalanceAfter"`
}
