package types

// 音效类别查询请求
type SoundEffectCategoriesQueryForm struct {
	ParentCategory string `json:"parentCategory"`
	Language string `json:"language"`
	IncludeSubcategories bool `json:"includeSubcategories"`
}
