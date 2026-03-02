package types


type OperationHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Action string `json:"action"`
	Description string `json:"description"`
	TargetType string `json:"targetType"`
	TargetId string `json:"targetId"`
	TargetName string `json:"targetName"`
	Result string `json:"result"`
	OperationTime string `json:"operationTime"`
	IpAddress string `json:"ipAddress"`
	UserAgent string `json:"userAgent"`
}
