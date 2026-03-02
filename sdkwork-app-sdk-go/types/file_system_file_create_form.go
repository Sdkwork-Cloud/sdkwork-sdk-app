package types

// Create file request
type FileSystemFileCreateForm struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	DiskId string `json:"diskId"`
	MimeType string `json:"mimeType"`
	AssetType string `json:"assetType"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	Prompt string `json:"prompt"`
	ThinkingContent string `json:"thinkingContent"`
	Encoding string `json:"encoding"`
}
