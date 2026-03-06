package types

// 笔记批量更新结果
type NoteBatchUpdateResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NoteId string `json:"noteId"`
	NoteUuid string `json:"noteUuid"`
	VersionId string `json:"versionId"`
	AppliedCount int `json:"appliedCount"`
	SkippedCount int `json:"skippedCount"`
	CharCount int `json:"charCount"`
	WordCount int `json:"wordCount"`
}
