package types

// Document detail response
type DocumentDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DocumentId string `json:"documentId"`
	DocumentUuid string `json:"documentUuid"`
	Title string `json:"title"`
	FolderId string `json:"folderId"`
	AssetType string `json:"assetType"`
	MimeType string `json:"mimeType"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	Status string `json:"status"`
	Summary string `json:"summary"`
	WordCount int `json:"wordCount"`
	CharCount int `json:"charCount"`
	Path string `json:"path"`
	ObjectKey string `json:"objectKey"`
	VersionId string `json:"versionId"`
	ContentVersion string `json:"contentVersion"`
	Extension string `json:"extension"`
}
