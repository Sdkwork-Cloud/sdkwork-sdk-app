package types

// 项目移动请求
type ProjectMoveForm struct {
	ProjectId string `json:"projectId"`
	TargetWorkspaceId string `json:"targetWorkspaceId"`
	MoveReason string `json:"moveReason"`
	RetainMembers bool `json:"retainMembers"`
	RetainSettings bool `json:"retainSettings"`
}
