package types

// 创建部门表单
type DepartmentCreateForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	OwnerId int `json:"ownerId"`
	ParentId int `json:"parentId"`
	SortOrder int `json:"sortOrder"`
	ManagerId int `json:"managerId"`
	Phone string `json:"phone"`
	Email string `json:"email"`
}
