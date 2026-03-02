package types

// 图片响应
type ImageVO struct {
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
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
}
