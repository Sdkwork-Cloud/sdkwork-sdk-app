package types

// 创建合集表单
type CollectionCreateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ParentId int `json:"parentId"`
}
