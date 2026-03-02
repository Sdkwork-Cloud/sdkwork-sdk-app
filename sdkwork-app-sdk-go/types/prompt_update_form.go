package types

// 更新提示语请求
type PromptUpdateForm struct {
	Title string `json:"title"`
	Content string `json:"content"`
	Description string `json:"description"`
	CateId int `json:"cateId"`
	Enabled bool `json:"enabled"`
	Sort int `json:"sort"`
	Parameters map[string]interface{} `json:"parameters"`
	Model string `json:"model"`
	IsPublic bool `json:"isPublic"`
}
