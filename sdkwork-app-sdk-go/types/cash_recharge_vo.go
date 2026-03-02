package types

// 现金充值响应
type CashRechargeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TransactionId string `json:"transactionId"`
	AccountId string `json:"accountId"`
	Amount float64 `json:"amount"`
	BalanceAfter float64 `json:"balanceAfter"`
	Status string `json:"status"`
	PaymentMethod string `json:"paymentMethod"`
	PayUrl string `json:"payUrl"`
}
