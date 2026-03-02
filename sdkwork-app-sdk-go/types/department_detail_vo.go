package types

// 部门详情响应
type DepartmentDetailVO struct {
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
	TreePath TreeNodePath `json:"treePath"`
	FullPathName string `json:"fullPathName"`
	ManagerId int `json:"managerId"`
	Phone string `json:"phone"`
	Email string `json:"email"`
	MemberCount int `json:"memberCount"`
	ChildrenCount int `json:"childrenCount"`
}
