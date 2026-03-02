package types

// 音乐响应
type MusicVO struct {
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
	ThumbnailUrl string `json:"thumbnailUrl"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	PlayCount int `json:"playCount"`
	LikeCount int `json:"likeCount"`
}
