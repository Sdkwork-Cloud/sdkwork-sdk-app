package types

// 创建租户表单
type TenantCreateForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	BizId int `json:"bizId"`
	Description string `json:"description"`
	AdminUserId int `json:"adminUserId"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	ExpireTime string `json:"expireTime"`
}
