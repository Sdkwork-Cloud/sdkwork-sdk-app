package types

// 收藏响应
type FavoriteVO struct {
	FavoriteId string `json:"favoriteId"`
	FavoriteType string `json:"favoriteType"`
	TargetId string `json:"targetId"`
	FavoriteName string `json:"favoriteName"`
	FolderId string `json:"folderId"`
	FavoriteTime string `json:"favoriteTime"`
	UpdateTime string `json:"updateTime"`
}
