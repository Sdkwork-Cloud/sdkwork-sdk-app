package types

// 消息附件
type AttachmentVO struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Type string `json:"type"`
	Size int `json:"size"`
	Url string `json:"url"`
	ThumbnailUrl string `json:"thumbnailUrl"`
}
