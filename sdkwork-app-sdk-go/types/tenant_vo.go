package types

// 租户响应
type TenantVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Status string `json:"status"`
	Description string `json:"description"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ExpireTime string `json:"expireTime"`
}
