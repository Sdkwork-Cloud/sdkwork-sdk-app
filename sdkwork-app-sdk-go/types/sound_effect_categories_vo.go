package types

// 音效类别响应
type SoundEffectCategoriesVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Categories []CategoryItem `json:"categories"`
}
