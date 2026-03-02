package types

// 说话人项
type VoiceSpeakerItem struct {
	SpeakerId string `json:"speakerId"`
	SpeakerName string `json:"speakerName"`
	Description string `json:"description"`
	PreviewAudioUrl string `json:"previewAudioUrl"`
	Gender string `json:"gender"`
	AgeRange string `json:"ageRange"`
	Language string `json:"language"`
	Style string `json:"style"`
	Favorite bool `json:"favorite"`
	CreatedAt string `json:"createdAt"`
}
