package types

// 合集详情响应
type CollectionDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CollectionId string `json:"collectionId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	CoverImage string `json:"coverImage"`
	IsPublic bool `json:"isPublic"`
	IsPinned bool `json:"isPinned"`
	ItemCount int `json:"itemCount"`
	ViewCount int `json:"viewCount"`
	FavoriteCount int `json:"favoriteCount"`
	ParentId int `json:"parentId"`
	Items []CollectionItemVO `json:"items"`
}
