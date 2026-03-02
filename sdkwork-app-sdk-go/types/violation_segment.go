package types

// 违规片段
type ViolationSegment struct {
	StartTime int `json:"startTime"`
	EndTime int `json:"endTime"`
	ViolationType string `json:"violationType"`
	Text string `json:"text"`
	Confidence float64 `json:"confidence"`
}
