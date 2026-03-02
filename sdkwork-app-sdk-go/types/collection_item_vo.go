package types

// 合集内容项响应
type CollectionItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ItemId string `json:"itemId"`
	CollectionId string `json:"collectionId"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Title string `json:"title"`
	Description string `json:"description"`
	CoverImage string `json:"coverImage"`
	Position int `json:"position"`
	IsPinned bool `json:"isPinned"`
	Tags string `json:"tags"`
	AddedAt string `json:"addedAt"`
}
