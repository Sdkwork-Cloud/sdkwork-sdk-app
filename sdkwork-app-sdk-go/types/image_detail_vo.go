package types

// 图片详情响应
type ImageDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ImageId string `json:"imageId"`
	Title string `json:"title"`
	Description string `json:"description"`
	Url string `json:"url"`
	Format string `json:"format"`
	Width int `json:"width"`
	Height int `json:"height"`
	AspectRatio string `json:"aspectRatio"`
	FileSize int `json:"fileSize"`
	Resource ImageMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	ViewCount int `json:"viewCount"`
	DownloadCount int `json:"downloadCount"`
	LikeCount int `json:"likeCount"`
}
