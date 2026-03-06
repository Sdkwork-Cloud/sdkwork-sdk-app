package types

// 笔记批量更新请求
type NoteBatchUpdateRequest struct {
	Requests []NoteBatchOperationRequest `json:"requests"`
	Strict bool `json:"strict"`
}
