package types

// 项目更新请求
type ProjectUpdateForm struct {
	ProjectId string `json:"projectId"`
	ProjectName string `json:"projectName"`
	ProjectDescription string `json:"projectDescription"`
	ProjectIcon string `json:"projectIcon"`
	ProjectColor string `json:"projectColor"`
	ProjectTags []string `json:"projectTags"`
	Settings ProjectSettings `json:"settings"`
}
