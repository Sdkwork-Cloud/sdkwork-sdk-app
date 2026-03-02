package types

// 实验转化事件请求
type ExperimentConversionForm struct {
	ExperimentKey string `json:"experimentKey"`
	ConversionGoal string `json:"conversionGoal"`
	ConversionValue float64 `json:"conversionValue"`
}
