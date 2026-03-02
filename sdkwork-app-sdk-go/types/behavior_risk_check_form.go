package types

// 行为风险检测请求
type BehaviorRiskCheckForm struct {
	UserId string `json:"userId"`
	BehaviorType string `json:"behaviorType"`
	Frequency int `json:"frequency"`
	Context map[string]interface{} `json:"context"`
	TimeWindow int `json:"timeWindow"`
}
