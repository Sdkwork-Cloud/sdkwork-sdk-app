package types

// 漏斗步骤VO
type FunnelStepVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EventName string `json:"eventName"`
	UserCount int `json:"userCount"`
	ConversionRate float64 `json:"conversionRate"`
	StepConversionRate float64 `json:"stepConversionRate"`
}
