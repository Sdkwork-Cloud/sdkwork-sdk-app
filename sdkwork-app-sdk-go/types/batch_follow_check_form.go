package types

// 批量检查关注状态请求
type BatchFollowCheckForm struct {
	UserIds []string `json:"userIds"`
	CheckType string `json:"checkType"`
}
