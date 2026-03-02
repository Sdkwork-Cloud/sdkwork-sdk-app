package types

// 注册表单
type RegisterForm struct {
	Username string `json:"username"`
	Password string `json:"password"`
	ConfirmPassword string `json:"confirmPassword"`
	Email string `json:"email"`
	Phone string `json:"phone"`
}
