package types

// 钱包操作结果
type WalletOperationResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestNo string `json:"requestNo"`
	TransactionId string `json:"transactionId"`
	OperationType string `json:"operationType"`
	AccountType string `json:"accountType"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	FromAccountId string `json:"fromAccountId"`
	ToAccountId string `json:"toAccountId"`
	Amount float64 `json:"amount"`
	Points int `json:"points"`
	Tokens int `json:"tokens"`
	FromBalanceAfter float64 `json:"fromBalanceAfter"`
	ToBalanceAfter float64 `json:"toBalanceAfter"`
	FromPointsAfter int `json:"fromPointsAfter"`
	ToPointsAfter int `json:"toPointsAfter"`
	TokenAfter int `json:"tokenAfter"`
	FrozenBalance float64 `json:"frozenBalance"`
	Channel string `json:"channel"`
	ResultDesc string `json:"resultDesc"`
	ProcessedAt string `json:"processedAt"`
}
