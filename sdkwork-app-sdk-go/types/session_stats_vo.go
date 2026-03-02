package types

// 会话统计信息
type SessionStatsVO struct {
	TotalMessages int `json:"totalMessages"`
	UserMessages int `json:"userMessages"`
	AiMessages int `json:"aiMessages"`
	TotalTokens int `json:"totalTokens"`
	AvgResponseTime int `json:"avgResponseTime"`
	TotalDuration int `json:"totalDuration"`
}
