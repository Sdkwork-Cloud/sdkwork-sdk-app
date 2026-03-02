package types

// 说话人生成响应
type VoiceSpeakerGenerationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	SpeakerId string `json:"speakerId"`
	SpeakerName string `json:"speakerName"`
	Description string `json:"description"`
	PreviewAudioUrl string `json:"previewAudioUrl"`
	Gender string `json:"gender"`
	AgeRange string `json:"ageRange"`
	Language string `json:"language"`
	Style string `json:"style"`
	Status string `json:"status"`
	Favorite bool `json:"favorite"`
	CompletedAt string `json:"completedAt"`
}
