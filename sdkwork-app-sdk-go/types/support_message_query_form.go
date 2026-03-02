package types

// 支持消息查询表单
type SupportMessageQueryForm struct {
	SessionId string `json:"sessionId"`
	Page int `json:"page"`
	Size int `json:"size"`
}
