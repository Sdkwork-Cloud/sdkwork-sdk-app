package types

// 收藏检查响应
type FavoriteCheckVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TargetId string `json:"targetId"`
	IsFavorite bool `json:"isFavorite"`
	FavoriteId string `json:"favoriteId"`
	FavoriteTime string `json:"favoriteTime"`
}
