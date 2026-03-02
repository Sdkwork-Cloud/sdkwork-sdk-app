package types


type HistoryBatchDeleteForm struct {
	HistoryIds []string `json:"historyIds"`
	Type string `json:"type"`
}
