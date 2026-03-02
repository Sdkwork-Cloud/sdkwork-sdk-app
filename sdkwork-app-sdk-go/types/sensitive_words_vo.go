package types

// 敏感词检测响应
type SensitiveWordsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	HasSensitiveWords bool `json:"hasSensitiveWords"`
	Count int `json:"count"`
	Words []WordHit `json:"words"`
	ProcessedText string `json:"processedText"`
	RiskLevel string `json:"riskLevel"`
}
