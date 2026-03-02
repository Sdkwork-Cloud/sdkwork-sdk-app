package types

// 生成任务响应
type GenerationTaskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId int `json:"taskId"`
	RequestId string `json:"requestId"`
	Type string `json:"type"`
	Model string `json:"model"`
	Channel string `json:"channel"`
	Status string `json:"status"`
	Progress int `json:"progress"`
	InputParams GenerationInput `json:"inputParams"`
	OutputResult GenerationOutput `json:"outputResult"`
	Cost float64 `json:"cost"`
	ErrorCode string `json:"errorCode"`
	ErrorMessage string `json:"errorMessage"`
	RetryCount int `json:"retryCount"`
	MaxRetry int `json:"maxRetry"`
	StartedAt string `json:"startedAt"`
	CompletedAt string `json:"completedAt"`
	ConversationId int `json:"conversationId"`
	MessageId int `json:"messageId"`
	ParentId int `json:"parentId"`
	BatchId string `json:"batchId"`
	BizScene string `json:"bizScene"`
	BizId int `json:"bizId"`
	Done bool `json:"done"`
}
