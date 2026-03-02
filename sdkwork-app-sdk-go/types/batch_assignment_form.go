package types

// 批量实验分组请求
type BatchAssignmentForm struct {
	ExperimentKeys []string `json:"experimentKeys"`
	UserAttributes map[string]interface{} `json:"userAttributes"`
}
