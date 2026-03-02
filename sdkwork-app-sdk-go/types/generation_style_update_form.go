package types

// 更新生成风格表单
type GenerationStyleUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	ConfigParams map[string]interface{} `json:"configParams"`
}
