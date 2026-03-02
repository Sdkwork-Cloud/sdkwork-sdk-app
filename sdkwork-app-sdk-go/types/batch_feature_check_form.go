package types

// 批量特性检查请求
type BatchFeatureCheckForm struct {
	FeatureKeys []string `json:"featureKeys"`
	UserAttributes interface{} `json:"userAttributes"`
}
