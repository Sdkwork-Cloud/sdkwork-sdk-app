package types

// 项目复制请求
type ProjectCopyForm struct {
	SourceProjectId string `json:"sourceProjectId"`
	TargetWorkspaceId string `json:"targetWorkspaceId"`
	NewName string `json:"newName"`
	NewProjectDescription string `json:"newProjectDescription"`
	CopyMembers bool `json:"copyMembers"`
	CopyFiles bool `json:"copyFiles"`
	CopySettings bool `json:"copySettings"`
	CopyReason string `json:"copyReason"`
}
