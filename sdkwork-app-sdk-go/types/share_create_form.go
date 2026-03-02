package types

// 创建分享请求
type ShareCreateForm struct {
	ShareType string `json:"shareType"`
	ContentId string `json:"contentId"`
	Title string `json:"title"`
	Description string `json:"description"`
	ImageUrl string `json:"imageUrl"`
	ExpireSeconds int `json:"expireSeconds"`
	PasswordRequired bool `json:"passwordRequired"`
	Password string `json:"password"`
	Channel string `json:"channel"`
}
