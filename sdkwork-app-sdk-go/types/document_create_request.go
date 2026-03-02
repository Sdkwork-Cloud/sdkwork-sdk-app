package types

// Create document request
type DocumentCreateRequest struct {
	Title string `json:"title"`
	Content string `json:"content"`
	FolderId string `json:"folderId"`
	DiskId string `json:"diskId"`
	Description string `json:"description"`
	MimeType string `json:"mimeType"`
	Tags []string `json:"tags"`
}
