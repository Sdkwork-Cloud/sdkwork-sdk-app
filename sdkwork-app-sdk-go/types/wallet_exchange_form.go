package types

// 钱包兑换请求(积分兑换现金或Token)
type WalletExchangeForm struct {
	Points int `json:"points"`
	Target string `json:"target"`
	RequestNo string `json:"requestNo"`
	Remarks string `json:"remarks"`
}
