package types

// 成员角色更新请求
type MemberRoleUpdateForm struct {
	WorkspaceId string `json:"workspaceId"`
	MemberId string `json:"memberId"`
	UserId string `json:"userId"`
	NewRoleId string `json:"newRoleId"`
	NewRoleName string `json:"newRoleName"`
	Permissions []string `json:"permissions"`
	UpdateReason string `json:"updateReason"`
	NeedNotify bool `json:"needNotify"`
}
