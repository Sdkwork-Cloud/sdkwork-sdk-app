package types

// 更新租户表单
type TenantUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ExpireTime string `json:"expireTime"`
}
