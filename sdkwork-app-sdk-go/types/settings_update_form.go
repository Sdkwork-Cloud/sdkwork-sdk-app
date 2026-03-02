package types

// 更新模块设置请求
type SettingsUpdateForm struct {
	Settings map[string]interface{} `json:"settings"`
	Module string `json:"module"`
	Overwrite bool `json:"overwrite"`
}
