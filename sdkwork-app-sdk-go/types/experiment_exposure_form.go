package types

// 实验曝光事件请求
type ExperimentExposureForm struct {
	ExperimentKey string `json:"experimentKey"`
	VariantKey string `json:"variantKey"`
	ExposureContext interface{} `json:"exposureContext"`
}
