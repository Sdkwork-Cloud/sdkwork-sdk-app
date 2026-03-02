package types

// 用户资料更新请求
type UserProfileUpdateForm struct {
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	Gender string `json:"gender"`
	Birthday string `json:"birthday"`
	Region string `json:"region"`
	Bio string `json:"bio"`
	Occupation string `json:"occupation"`
	Interests string `json:"interests"`
	Phone string `json:"phone"`
	Email string `json:"email"`
	VerifyCode string `json:"verifyCode"`
}
