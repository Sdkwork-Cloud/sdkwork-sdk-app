package types

// 钱包操作状态
type WalletOperationStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestNo string `json:"requestNo"`
	Found bool `json:"found"`
	Completed bool `json:"completed"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	TransactionId string `json:"transactionId"`
	OperationType string `json:"operationType"`
	AccountType string `json:"accountType"`
	ProcessedAt string `json:"processedAt"`
	RelatedTransactionIds []string `json:"relatedTransactionIds"`
	Details []HistoryVO `json:"details"`
	ResultDesc string `json:"resultDesc"`
}
