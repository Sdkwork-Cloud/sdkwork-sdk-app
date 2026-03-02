package types

// 收藏项响应
type FavoriteItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FavoriteId string `json:"favoriteId"`
	FavoriteType string `json:"favoriteType"`
	TargetId string `json:"targetId"`
	FavoriteName string `json:"favoriteName"`
	FolderId string `json:"folderId"`
	FavoriteTime string `json:"favoriteTime"`
	UpdateTime string `json:"updateTime"`
}
