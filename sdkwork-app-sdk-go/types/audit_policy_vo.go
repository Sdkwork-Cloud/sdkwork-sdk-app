package types

// 审核策略响应
type AuditPolicyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PolicyId string `json:"policyId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Scenes []string `json:"scenes"`
	DetectionTypes []DetectionTypeConfig `json:"detectionTypes"`
	Thresholds map[string]float64 `json:"thresholds"`
	Enabled bool `json:"enabled"`
	Priority int `json:"priority"`
}
