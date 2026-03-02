package types

// 投票表单
type VoteForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Rating string `json:"rating"`
	Source string `json:"source"`
	DeviceInfo string `json:"deviceInfo"`
}
