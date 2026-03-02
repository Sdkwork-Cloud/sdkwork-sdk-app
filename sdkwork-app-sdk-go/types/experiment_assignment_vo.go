package types

// 实验分组响应
type ExperimentAssignmentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExperimentKey string `json:"experimentKey"`
	VariantKey string `json:"variantKey"`
	VariantName string `json:"variantName"`
	AssignmentReason string `json:"assignmentReason"`
	AssignmentParams map[string]interface{} `json:"assignmentParams"`
}
