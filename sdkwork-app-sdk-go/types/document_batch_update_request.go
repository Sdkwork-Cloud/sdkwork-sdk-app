package types

// Batch update request similar to Google Docs batchUpdate
type DocumentBatchUpdateRequest struct {
	Requests []DocumentBatchOperationRequest `json:"requests"`
	Strict bool `json:"strict"`
}
