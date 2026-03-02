package types

// Batch operation request for document content
type DocumentBatchOperationRequest struct {
	Type string `json:"type"`
	Index int `json:"index"`
	StartIndex int `json:"startIndex"`
	EndIndex int `json:"endIndex"`
	Text string `json:"text"`
	SearchText string `json:"searchText"`
	ReplaceText string `json:"replaceText"`
}
