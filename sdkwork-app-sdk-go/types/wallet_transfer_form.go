package types

// 钱包转账请求
type WalletTransferForm struct {
	AccountType string `json:"accountType"`
	ToUserId string `json:"toUserId"`
	Amount float64 `json:"amount"`
	Points int `json:"points"`
	RequestNo string `json:"requestNo"`
	Remarks string `json:"remarks"`
}
