package types

// 租户详情响应
type TenantDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	BizId int `json:"bizId"`
	Status string `json:"status"`
	Description string `json:"description"`
	AdminUserId int `json:"adminUserId"`
	InstallAppList InstallAppList `json:"installAppList"`
	Metadata TenantMetadata `json:"metadata"`
	ContactPerson string `json:"contactPerson"`
	ContactPhone string `json:"contactPhone"`
	TokenExpirationMs int `json:"tokenExpirationMs"`
	RefreshTokenExpirationMs int `json:"refreshTokenExpirationMs"`
	ExpireTime string `json:"expireTime"`
}
