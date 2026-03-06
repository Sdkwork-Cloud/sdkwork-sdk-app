package types

// 笔记正文响应
type NoteContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NoteId string `json:"noteId"`
	NoteUuid string `json:"noteUuid"`
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
