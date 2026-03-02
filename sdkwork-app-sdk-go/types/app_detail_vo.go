package types

// 应用详情响应
type AppDetailVO struct {
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
	Platforms AppPlatforms `json:"platforms"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	StoreUrl string `json:"storeUrl"`
	DownloadUrl string `json:"downloadUrl"`
}
