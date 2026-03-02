package types

// 投票响应
type VoteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VoteId string `json:"voteId"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Rating string `json:"rating"`
}
