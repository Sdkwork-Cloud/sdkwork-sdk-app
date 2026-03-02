package types

// 组织响应
type OrganizationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	LogoUrl string `json:"logoUrl"`
}
