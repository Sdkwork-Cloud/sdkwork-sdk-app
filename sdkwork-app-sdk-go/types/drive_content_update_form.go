package types

// Drive file content update form
type DriveContentUpdateForm struct {
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Encoding string `json:"encoding"`
}
