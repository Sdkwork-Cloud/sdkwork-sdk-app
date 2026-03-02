package types

// 项目详情响应
type ProjectDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ProjectId string `json:"projectId"`
	ProjectName string `json:"projectName"`
	ProjectTitle string `json:"projectTitle"`
	ProjectDescription string `json:"projectDescription"`
	ProjectType string `json:"projectType"`
	ProjectTypeName string `json:"projectTypeName"`
	ProjectCode string `json:"projectCode"`
	ProjectIcon string `json:"projectIcon"`
	CoverImageUrl string `json:"coverImageUrl"`
	ProjectTags []string `json:"projectTags"`
	WorkspaceId string `json:"workspaceId"`
	WorkspaceName string `json:"workspaceName"`
	CreatorId string `json:"creatorId"`
	CreatorName string `json:"creatorName"`
	Author string `json:"author"`
	SitePath string `json:"sitePath"`
	DomainPrefix string `json:"domainPrefix"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	IsTemplate bool `json:"isTemplate"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	Members []MemberVO `json:"members"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	Settings ProjectSettings `json:"settings"`
}
