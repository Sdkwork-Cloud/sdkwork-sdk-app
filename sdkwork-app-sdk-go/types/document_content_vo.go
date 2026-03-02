package types

// Document content response
type DocumentContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DocumentId string `json:"documentId"`
	DocumentUuid string `json:"documentUuid"`
	ContentId string `json:"contentId"`
	VersionId string `json:"versionId"`
	Encoding string `json:"encoding"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	CharCount int `json:"charCount"`
	WordCount int `json:"wordCount"`
}
