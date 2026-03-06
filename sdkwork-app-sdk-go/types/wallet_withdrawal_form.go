package types

// 钱包提现请求
type WalletWithdrawalForm struct {
	Amount float64 `json:"amount"`
	WithdrawMethod string `json:"withdrawMethod"`
	AccountNo string `json:"accountNo"`
	AccountName string `json:"accountName"`
	BankName string `json:"bankName"`
	RequestNo string `json:"requestNo"`
	Remarks string `json:"remarks"`
}
