package types

// Document batch update result
type DocumentBatchUpdateResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DocumentId string `json:"documentId"`
	DocumentUuid string `json:"documentUuid"`
	VersionId string `json:"versionId"`
	AppliedCount int `json:"appliedCount"`
	SkippedCount int `json:"skippedCount"`
	CharCount int `json:"charCount"`
	WordCount int `json:"wordCount"`
}
