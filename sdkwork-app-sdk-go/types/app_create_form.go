package types

// 创建应用表单
type AppCreateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	AppType string `json:"appType"`
	ProjectId int `json:"projectId"`
	InstallSkill AppInstallSkill `json:"installSkill"`
}
