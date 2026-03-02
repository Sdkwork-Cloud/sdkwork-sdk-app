package types

// 批量移动收藏请求
type FavoriteBatchMoveForm struct {
	FavoriteIds []string `json:"favoriteIds"`
	TargetFolderId string `json:"targetFolderId"`
	FolderId string `json:"folderId"`
}
