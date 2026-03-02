package types


type UpdateCheckVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	HasUpdate bool `json:"hasUpdate"`
	LatestVersion string `json:"latestVersion"`
	CurrentVersion string `json:"currentVersion"`
	DownloadUrl string `json:"downloadUrl"`
	UpdateType string `json:"updateType"`
	Title string `json:"title"`
	Description string `json:"description"`
	FileSize int `json:"fileSize"`
	ForceUpdate bool `json:"forceUpdate"`
}
