package types

// Filesystem file content object
type FileSystemContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NodeId string `json:"nodeId"`
	NodeUuid string `json:"nodeUuid"`
	ContentId string `json:"contentId"`
	FileVersion string `json:"fileVersion"`
	Encoding string `json:"encoding"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	CharCount int `json:"charCount"`
	WordCount int `json:"wordCount"`
}
