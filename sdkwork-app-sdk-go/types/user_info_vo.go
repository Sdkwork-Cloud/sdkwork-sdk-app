package types

// 用户信息
type UserInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Username string `json:"username"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	Role string `json:"role"`
	Status string `json:"status"`
}
