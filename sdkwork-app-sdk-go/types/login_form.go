package types

// 登录表单
type LoginForm struct {
	Username string `json:"username"`
	Password string `json:"password"`
	Captcha string `json:"captcha"`
}
