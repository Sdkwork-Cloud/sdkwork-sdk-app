package types

// 移动收藏请求
type FavoriteMoveForm struct {
	FavoriteId string `json:"favoriteId"`
	TargetFolderId string `json:"targetFolderId"`
	FolderId string `json:"folderId"`
}
