package types

// 账户注销请求
type AccountDeactivateForm struct {
	Reason string `json:"reason"`
	VerifyCode string `json:"verifyCode"`
	Password string `json:"password"`
	Confirm bool `json:"confirm"`
	Remark string `json:"remark"`
}
