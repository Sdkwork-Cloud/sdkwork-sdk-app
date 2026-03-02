package types

// 更新分享请求
type ShareUpdateForm struct {
	ShareId string `json:"shareId"`
	Title string `json:"title"`
	Description string `json:"description"`
	ImageUrl string `json:"imageUrl"`
	ExpireSeconds int `json:"expireSeconds"`
	PasswordRequired bool `json:"passwordRequired"`
	Password string `json:"password"`
	Status string `json:"status"`
}
