package types

// 更新笔记正文请求
type NoteContentUpdateRequest struct {
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Encoding string `json:"encoding"`
	BumpVersion bool `json:"bumpVersion"`
}
