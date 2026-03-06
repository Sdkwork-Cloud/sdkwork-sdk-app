package types

// 笔记批量操作请求
type NoteBatchOperationRequest struct {
	Type string `json:"type"`
	Index int `json:"index"`
	StartIndex int `json:"startIndex"`
	EndIndex int `json:"endIndex"`
	Text string `json:"text"`
	SearchText string `json:"searchText"`
	ReplaceText string `json:"replaceText"`
}
