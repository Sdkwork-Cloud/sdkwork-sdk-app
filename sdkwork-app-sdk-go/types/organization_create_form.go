package types

// 创建组织表单
type OrganizationCreateForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	Address string `json:"address"`
	Website string `json:"website"`
	LogoUrl string `json:"logoUrl"`
}
