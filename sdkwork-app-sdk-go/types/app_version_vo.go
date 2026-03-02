package types

// 应用版本响应
type AppVersionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CurrentVersion string `json:"currentVersion"`
	LatestVersion string `json:"latestVersion"`
	UpdateRequired bool `json:"updateRequired"`
	ForceUpdate bool `json:"forceUpdate"`
	UpdateDescription string `json:"updateDescription"`
	UpdateUrl string `json:"updateUrl"`
	UpdateSize string `json:"updateSize"`
	ReleaseDate int `json:"releaseDate"`
}
