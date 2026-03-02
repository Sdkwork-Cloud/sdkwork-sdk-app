package types

// 视频详情响应
type VideoDetailVO struct {
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
	Resolution string `json:"resolution"`
	FileSize int `json:"fileSize"`
	CategoryId int `json:"categoryId"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Resource VideoMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	PlayCount int `json:"playCount"`
	DownloadCount int `json:"downloadCount"`
	LikeCount int `json:"likeCount"`
}
