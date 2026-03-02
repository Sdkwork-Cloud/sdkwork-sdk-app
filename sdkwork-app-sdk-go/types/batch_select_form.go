package types

// 批量更新选中状态请求
type BatchSelectForm struct {
	ItemIds []int `json:"itemIds"`
	Selected bool `json:"selected"`
}
