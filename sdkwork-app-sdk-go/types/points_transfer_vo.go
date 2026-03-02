package types

// 积分转账响应
type PointsTransferVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TransactionId string `json:"transactionId"`
	FromAccountId string `json:"fromAccountId"`
	ToAccountId string `json:"toAccountId"`
	Points int `json:"points"`
	Status string `json:"status"`
	FromPointsAfter int `json:"fromPointsAfter"`
	ToPointsAfter int `json:"toPointsAfter"`
}
