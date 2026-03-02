package types

// 更新合集表单
type CollectionUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	CoverImage string `json:"coverImage"`
}
