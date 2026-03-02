package types

// AI提示语使用历史响应
type PromptHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	PromptId int `json:"promptId"`
	PromptTitle string `json:"promptTitle"`
	PromptContent string `json:"promptContent"`
	UsedContent string `json:"usedContent"`
	ResponseContent string `json:"responseContent"`
	Model string `json:"model"`
	Duration int `json:"duration"`
	InputTokens int `json:"inputTokens"`
	OutputTokens int `json:"outputTokens"`
	Success bool `json:"success"`
	ErrorMessage string `json:"errorMessage"`
}
