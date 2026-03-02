package types

// 视频响应
type VideoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VideoId string `json:"videoId"`
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	Width int `json:"width"`
	Height int `json:"height"`
	AspectRatio string `json:"aspectRatio"`
	CategoryId int `json:"categoryId"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	PlayCount int `json:"playCount"`
	LikeCount int `json:"likeCount"`
}
