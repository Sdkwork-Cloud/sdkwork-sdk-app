package types

// 项目设置
type ProjectSettings struct {
	IsPublic bool `json:"isPublic"`
	AllowComments bool `json:"allowComments"`
	AllowFileUpload bool `json:"allowFileUpload"`
	AllowInviteMembers bool `json:"allowInviteMembers"`
}
