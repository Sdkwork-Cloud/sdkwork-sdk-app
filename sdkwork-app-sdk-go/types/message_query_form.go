package types

// 查询消息列表请求
type MessageQueryForm struct {
	ConversationId string `json:"conversationId"`
	Page int `json:"page"`
	Size int `json:"size"`
	MessageType string `json:"messageType"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
}
