package types

// 帧检测
type FrameDetection struct {
	Timestamp int `json:"timestamp"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
}
