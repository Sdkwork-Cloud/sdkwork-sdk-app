package types

// 成员响应
type MemberVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	MemberId string `json:"memberId"`
	UserId string `json:"userId"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	Email string `json:"email"`
	RoleId string `json:"roleId"`
	RoleName string `json:"roleName"`
	Permissions []string `json:"permissions"`
	JoinTime string `json:"joinTime"`
	LastActiveTime string `json:"lastActiveTime"`
	Status string `json:"status"`
	IsCreator bool `json:"isCreator"`
	IsAdmin bool `json:"isAdmin"`
}
