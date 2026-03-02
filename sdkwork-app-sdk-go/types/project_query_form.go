package types

// 项目查询请求
type ProjectQueryForm struct {
	WorkspaceId string `json:"workspaceId"`
	Keyword string `json:"keyword"`
	ProjectName string `json:"projectName"`
	Type string `json:"type"`
	ProjectTags []string `json:"projectTags"`
	Status string `json:"status"`
	CreatorId string `json:"creatorId"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Page int `json:"page"`
	Size int `json:"size"`
}
