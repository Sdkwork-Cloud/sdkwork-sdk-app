package types

// 异常模式
type AnomalyPattern struct {
	Type string `json:"type"`
	Description string `json:"description"`
	Severity string `json:"severity"`
	DetectedAt string `json:"detectedAt"`
}
