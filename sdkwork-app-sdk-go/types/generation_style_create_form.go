package types

// 创建生成风格表单
type GenerationStyleCreateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ConfigParams map[string]interface{} `json:"configParams"`
	IsPublic bool `json:"isPublic"`
}
