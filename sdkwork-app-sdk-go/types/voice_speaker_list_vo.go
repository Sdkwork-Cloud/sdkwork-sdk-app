package types

// 说话人列表响应
type VoiceSpeakerListVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Speakers []VoiceSpeakerItem `json:"speakers"`
	Total int `json:"total"`
	Page int `json:"page"`
	Size int `json:"size"`
}
