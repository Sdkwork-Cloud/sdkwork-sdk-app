package types

// 查询提示语历史记录请求
type PromptHistoryQueryForm struct {
	PromptId int `json:"promptId"`
	Keyword string `json:"keyword"`
	Model string `json:"model"`
	Success bool `json:"success"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortBy string `json:"sortBy"`
	SortDirection string `json:"sortDirection"`
}
