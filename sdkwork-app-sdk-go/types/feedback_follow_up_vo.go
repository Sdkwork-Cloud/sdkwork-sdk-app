package types

// 反馈跟进信息
type FeedbackFollowUpVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	FeedbackId string `json:"feedbackId"`
	Content string `json:"content"`
	AttachmentUrl string `json:"attachmentUrl"`
	FollowUpTime string `json:"followUpTime"`
	Follower string `json:"follower"`
}
