package types

// Update document request
type DocumentUpdateRequest struct {
	Title string `json:"title"`
	FolderId string `json:"folderId"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
}
