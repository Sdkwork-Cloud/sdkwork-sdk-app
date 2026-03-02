package types

// 批量删除收藏请求
type FavoriteBatchRemoveForm struct {
	FavoriteIds []string `json:"favoriteIds"`
}
