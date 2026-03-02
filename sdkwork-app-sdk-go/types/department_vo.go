package types

// 部门响应
type DepartmentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	OwnerId int `json:"ownerId"`
	ParentId int `json:"parentId"`
	Level int `json:"level"`
	IsActive bool `json:"isActive"`
	SortOrder int `json:"sortOrder"`
	FullPathName string `json:"fullPathName"`
}
