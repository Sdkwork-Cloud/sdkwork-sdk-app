package types

// 现金转账请求
type CashTransferForm struct {
	ToUserId string `json:"toUserId"`
	Amount float64 `json:"amount"`
	Remarks string `json:"remarks"`
	PayPassword string `json:"payPassword"`
}
