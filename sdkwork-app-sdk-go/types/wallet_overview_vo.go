package types

// 钱包总览
type WalletOverviewVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	SnapshotAt string `json:"snapshotAt"`
	CashAvailable float64 `json:"cashAvailable"`
	CashFrozen float64 `json:"cashFrozen"`
	PointsAvailable int `json:"pointsAvailable"`
	PointsFrozen int `json:"pointsFrozen"`
	TokenAvailable int `json:"tokenAvailable"`
	TokenFrozen int `json:"tokenFrozen"`
	Accounts []WalletAssetAccountVO `json:"accounts"`
}
