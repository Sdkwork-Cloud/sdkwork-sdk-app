package types

// 下载设置
type DownloadSettings struct {
	DownloadPath string `json:"downloadPath"`
	WifiOnly bool `json:"wifiOnly"`
	AutoDownload bool `json:"autoDownload"`
	MaxConcurrent int `json:"maxConcurrent"`
}
