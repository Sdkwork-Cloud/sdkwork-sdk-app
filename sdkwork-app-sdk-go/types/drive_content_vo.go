package types

// Drive file content
type DriveContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FileId string `json:"fileId"`
	FileUuid string `json:"fileUuid"`
	FileVersion string `json:"fileVersion"`
	ContentId string `json:"contentId"`
	Encoding string `json:"encoding"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
}
