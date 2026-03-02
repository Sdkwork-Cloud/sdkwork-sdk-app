package types

// 现金提现请求
type CashWithdrawForm struct {
	Amount float64 `json:"amount"`
	WithdrawMethod string `json:"withdrawMethod"`
	AccountNo string `json:"accountNo"`
	AccountName string `json:"accountName"`
	BankName string `json:"bankName"`
	Remarks string `json:"remarks"`
}
