package types

// 租户类型响应
type TenantTypeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Type string `json:"type"`
	Name string `json:"name"`
}
