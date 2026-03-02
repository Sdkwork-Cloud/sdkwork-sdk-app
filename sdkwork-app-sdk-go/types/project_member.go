package types

// 项目成员
type ProjectMember struct {
	UserId string `json:"userId"`
	RoleId string `json:"roleId"`
	RoleName string `json:"roleName"`
	Permissions []string `json:"permissions"`
}
