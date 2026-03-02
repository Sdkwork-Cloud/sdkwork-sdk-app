package types

// 账户历史记录响应
type HistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	HistoryId string `json:"historyId"`
	AccountId string `json:"accountId"`
	TransactionType string `json:"transactionType"`
	TransactionTypeName string `json:"transactionTypeName"`
	Amount float64 `json:"amount"`
	Points int `json:"points"`
	Tokens int `json:"tokens"`
	BalanceBefore float64 `json:"balanceBefore"`
	BalanceAfter float64 `json:"balanceAfter"`
	PointsBefore int `json:"pointsBefore"`
	PointsAfter int `json:"pointsAfter"`
	TransactionId string `json:"transactionId"`
	RelatedId string `json:"relatedId"`
	RelatedType string `json:"relatedType"`
	Remarks string `json:"remarks"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	CounterpartyAccountId string `json:"counterpartyAccountId"`
	CounterpartyUserId string `json:"counterpartyUserId"`
	CounterpartyUserName string `json:"counterpartyUserName"`
}
