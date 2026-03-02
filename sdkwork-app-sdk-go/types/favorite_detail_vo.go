package types

// 收藏详情响应
type FavoriteDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FavoriteId string `json:"favoriteId"`
	FavoriteType string `json:"favoriteType"`
	TargetId string `json:"targetId"`
	FavoriteName string `json:"favoriteName"`
	FavoriteDescription string `json:"favoriteDescription"`
	FolderId string `json:"folderId"`
	FolderName string `json:"folderName"`
	Tags string `json:"tags"`
	FavoriteTime string `json:"favoriteTime"`
	UpdateTime string `json:"updateTime"`
	TargetInfo interface{} `json:"targetInfo"`
}
