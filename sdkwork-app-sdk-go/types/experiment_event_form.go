package types

// 实验事件请求
type ExperimentEventForm struct {
	ExperimentKey string `json:"experimentKey"`
	EventType string `json:"eventType"`
	EventData interface{} `json:"eventData"`
}
