package types

// AI使用统计VO
type AiUsageStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StatsId string `json:"statsId"`
	ModelName string `json:"modelName"`
	PromptTokens int `json:"promptTokens"`
	CompletionTokens int `json:"completionTokens"`
	TotalTokens int `json:"totalTokens"`
	RequestCount int `json:"requestCount"`
	ErrorCount int `json:"errorCount"`
	Date string `json:"date"`
	UserId string `json:"userId"`
}
