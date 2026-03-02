package types

// 行为风险检测响应
type BehaviorRiskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	BehaviorType string `json:"behaviorType"`
	RiskLevel string `json:"riskLevel"`
	RiskScore int `json:"riskScore"`
	Anomalies []AnomalyPattern `json:"anomalies"`
	FrequencyStats FrequencyStats `json:"frequencyStats"`
	Suggestion string `json:"suggestion"`
	Restrictions []string `json:"restrictions"`
}
