package types

// 批量检查收藏请求
type FavoriteBatchCheckForm struct {
	FavoriteType string `json:"favoriteType"`
	TargetIds []string `json:"targetIds"`
	Items []CheckItem `json:"items"`
}
