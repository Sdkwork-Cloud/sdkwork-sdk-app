package types


type LoginHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	LoginTime string `json:"loginTime"`
	IpAddress string `json:"ipAddress"`
	Location string `json:"location"`
	Device string `json:"device"`
	Browser string `json:"browser"`
	Os string `json:"os"`
	LoginMethod string `json:"loginMethod"`
	Status string `json:"status"`
	Result string `json:"result"`
	FailureReason string `json:"failureReason"`
}
