package types

// 账号风险检测响应
type AccountRiskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	DeviceId string `json:"deviceId"`
	RiskLevel string `json:"riskLevel"`
	RiskScore int `json:"riskScore"`
	Risks []RiskItem `json:"risks"`
	Suggestion string `json:"suggestion"`
	NeedVerification bool `json:"needVerification"`
}
