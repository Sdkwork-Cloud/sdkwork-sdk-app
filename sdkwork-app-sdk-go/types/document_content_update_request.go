package types

// Update document content request
type DocumentContentUpdateRequest struct {
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Encoding string `json:"encoding"`
}
