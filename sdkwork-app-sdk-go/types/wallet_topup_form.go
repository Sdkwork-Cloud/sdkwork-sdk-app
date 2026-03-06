package types

// 钱包充值请求
type WalletTopupForm struct {
	Amount float64 `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
	RequestNo string `json:"requestNo"`
	Remarks string `json:"remarks"`
}
