package types

// 合集树响应
type CollectionTreeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CollectionId string `json:"collectionId"`
	Name string `json:"name"`
	Type string `json:"type"`
	ItemCount int `json:"itemCount"`
	ParentId int `json:"parentId"`
}
