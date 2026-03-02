package types

// 批量取消分享请求
type BatchCancelShareForm struct {
	ShareIds []string `json:"shareIds"`
	Reason string `json:"reason"`
}
