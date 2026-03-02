package types

// 添加收藏请求
type FavoriteAddForm struct {
	FavoriteType string `json:"favoriteType"`
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	FavoriteName string `json:"favoriteName"`
	FavoriteDescription string `json:"favoriteDescription"`
	FolderId string `json:"folderId"`
	Tags string `json:"tags"`
}
