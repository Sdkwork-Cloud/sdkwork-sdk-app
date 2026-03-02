package types

// 分享海报响应
type SharePosterVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PosterUrl string `json:"posterUrl"`
	Width int `json:"width"`
	Height int `json:"height"`
	FileSize string `json:"fileSize"`
}
