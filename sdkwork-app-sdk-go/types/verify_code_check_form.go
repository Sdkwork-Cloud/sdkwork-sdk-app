package types

// 校验验证码请求
type VerifyCodeCheckForm struct {
	Target string `json:"target"`
	Type string `json:"type"`
	VerifyType string `json:"verifyType"`
	Code string `json:"code"`
}
