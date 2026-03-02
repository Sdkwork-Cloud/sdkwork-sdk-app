package types

// 各类型收藏数量VO
type FavoriteTypeCountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Type string `json:"type"`
	Count int `json:"count"`
	TypeName string `json:"typeName"`
}
