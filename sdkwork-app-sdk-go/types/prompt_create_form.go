package types

// 创建提示语请求
type PromptCreateForm struct {
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Description string `json:"description"`
	CateId int `json:"cateId"`
	Sort int `json:"sort"`
	Parameters map[string]interface{} `json:"parameters"`
	Model string `json:"model"`
	IsPublic bool `json:"isPublic"`
}
