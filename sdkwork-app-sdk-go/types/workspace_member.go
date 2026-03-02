package types

// 工作空间成员
type WorkspaceMember struct {
	UserId string `json:"userId"`
	RoleId string `json:"roleId"`
	RoleName string `json:"roleName"`
	Permissions []string `json:"permissions"`
}
