package types

// 更新应用表单
type AppUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	AccessUrl string `json:"accessUrl"`
	Version string `json:"version"`
	IconUrl string `json:"iconUrl"`
	Config AppConfig `json:"config"`
	Platforms AppPlatforms `json:"platforms"`
	InstallPlatforms AppPlatforms `json:"installPlatforms"`
	InstallSkill AppInstallSkill `json:"installSkill"`
	InstallConfig AppInstallConfig `json:"installConfig"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	StoreUrl string `json:"storeUrl"`
	DownloadUrl string `json:"downloadUrl"`
}
