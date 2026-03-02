package types

// 频率统计
type FrequencyStats struct {
	CurrentFrequency int `json:"currentFrequency"`
	AvgFrequency int `json:"avgFrequency"`
	Limit int `json:"limit"`
	ExcessRatio float64 `json:"excessRatio"`
}
