package types

// 时间戳段
type TimestampedSegment struct {
	StartTime int `json:"startTime"`
	EndTime int `json:"endTime"`
	Text string `json:"text"`
	SpeakerId int `json:"speakerId"`
	Confidence float64 `json:"confidence"`
}
