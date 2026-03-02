package types

// 用户资料响应
type UserProfileVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	Gender string `json:"gender"`
	Birthday int `json:"birthday"`
	Region string `json:"region"`
	Bio string `json:"bio"`
	Occupation string `json:"occupation"`
	Interests string `json:"interests"`
	Phone string `json:"phone"`
	Email string `json:"email"`
}
