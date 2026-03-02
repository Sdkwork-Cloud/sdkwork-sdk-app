package types

// 账户余额汇总响应
type AccountSummaryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CashAvailable float64 `json:"cashAvailable"`
	CashFrozen float64 `json:"cashFrozen"`
	PointsAvailable int `json:"pointsAvailable"`
	PointsFrozen int `json:"pointsFrozen"`
	TokenAvailable int `json:"tokenAvailable"`
	TokenFrozen int `json:"tokenFrozen"`
	HasPayPassword bool `json:"hasPayPassword"`
}
