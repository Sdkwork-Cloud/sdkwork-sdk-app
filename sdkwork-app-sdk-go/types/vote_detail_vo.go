package types

// 投票详情响应
type VoteDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VoteId string `json:"voteId"`
	UserId int `json:"userId"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Rating string `json:"rating"`
	Source string `json:"source"`
	ClientIp string `json:"clientIp"`
	DeviceInfo string `json:"deviceInfo"`
}
