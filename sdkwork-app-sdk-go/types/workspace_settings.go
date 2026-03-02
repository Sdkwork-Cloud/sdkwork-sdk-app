package types

// 工作空间设置
type WorkspaceSettings struct {
	IsPublic bool `json:"isPublic"`
	AllowInvite bool `json:"allowInvite"`
	AllowCreateProject bool `json:"allowCreateProject"`
	AllowFileUpload bool `json:"allowFileUpload"`
}
