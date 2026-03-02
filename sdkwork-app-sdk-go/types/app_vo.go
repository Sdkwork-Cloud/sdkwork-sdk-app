package types

// 应用响应
type AppVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AppId string `json:"appId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon ImageMediaResource `json:"icon"`
	IconUrl string `json:"iconUrl"`
	AccessUrl string `json:"accessUrl"`
	Version string `json:"version"`
	AppType string `json:"appType"`
	Status string `json:"status"`
	ProjectId int `json:"projectId"`
}
