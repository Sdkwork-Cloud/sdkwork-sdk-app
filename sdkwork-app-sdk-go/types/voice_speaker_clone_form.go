package types

// 声音克隆请求
type VoiceSpeakerCloneForm struct {
	SampleAudioUrl string `json:"sampleAudioUrl"`
	SpeakerName string `json:"speakerName"`
	Language string `json:"language"`
	Model string `json:"model"`
}
