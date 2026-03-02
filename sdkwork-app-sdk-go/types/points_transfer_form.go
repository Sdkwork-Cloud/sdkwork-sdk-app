package types

// 积分转账请求
type PointsTransferForm struct {
	ToUserId string `json:"toUserId"`
	Points int `json:"points"`
	Remarks string `json:"remarks"`
}
