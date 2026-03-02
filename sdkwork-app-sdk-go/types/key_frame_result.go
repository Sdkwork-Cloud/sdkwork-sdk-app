package types

// 关键帧结果
type KeyFrameResult struct {
	Timestamp int `json:"timestamp"`
	FrameUrl string `json:"frameUrl"`
	DetectionResult ImageAuditVO `json:"detectionResult"`
}
