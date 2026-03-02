package types

// 音乐详情响应
type MusicDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	MusicId string `json:"musicId"`
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	Artist string `json:"artist"`
	Genre string `json:"genre"`
	Bitrate int `json:"bitrate"`
	FileSize int `json:"fileSize"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Resource MusicMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	PlayCount int `json:"playCount"`
	DownloadCount int `json:"downloadCount"`
	LikeCount int `json:"likeCount"`
}
