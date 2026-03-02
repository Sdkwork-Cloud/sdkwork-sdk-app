package types

// 查询聊天会话请求
type ChatSessionQueryForm struct {
	SessionId int `json:"sessionId"`
	Name string `json:"name"`
	Type string `json:"type"`
	Page int `json:"page"`
	Size int `json:"size"`
	SortBy string `json:"sortBy"`
	SortDirection string `json:"sortDirection"`
	IncludeMessageCount bool `json:"includeMessageCount"`
}
