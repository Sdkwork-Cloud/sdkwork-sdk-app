package types

// 更新应用表单
type AppUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	AccessUrl string `json:"accessUrl"`
}
