package types

// 更新日志响应
type ChangelogVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Version string `json:"version"`
	ReleaseDate string `json:"releaseDate"`
	Title string `json:"title"`
	Features []string `json:"features"`
	BugFixes []string `json:"bugFixes"`
	Improvements []string `json:"improvements"`
	Status string `json:"status"`
	DownloadUrl string `json:"downloadUrl"`
}
