package types

// 语音项
type VoiceItem struct {
	VoiceId string `json:"voiceId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Language string `json:"language"`
	Gender string `json:"gender"`
	Style string `json:"style"`
	PreviewAudioUrl string `json:"previewAudioUrl"`
}
