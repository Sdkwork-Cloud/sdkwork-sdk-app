package types

// 组织详情响应
type OrganizationDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	Address string `json:"address"`
	Website string `json:"website"`
	LogoUrl string `json:"logoUrl"`
	Metadata OrganizationMetadata `json:"metadata"`
	InstallAppList InstallAppList `json:"installAppList"`
	MemberCount int `json:"memberCount"`
	DepartmentCount int `json:"departmentCount"`
	PositionCount int `json:"positionCount"`
}
