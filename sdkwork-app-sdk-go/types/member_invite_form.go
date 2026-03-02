package types

// 成员邀请请求
type MemberInviteForm struct {
	WorkspaceId string `json:"workspaceId"`
	Emails []string `json:"emails"`
	RoleId string `json:"roleId"`
	RoleName string `json:"roleName"`
	Permissions []string `json:"permissions"`
	InviteMessage string `json:"inviteMessage"`
	ExpireHours int `json:"expireHours"`
	NeedApproval bool `json:"needApproval"`
}
