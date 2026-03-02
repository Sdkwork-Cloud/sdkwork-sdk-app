package types

// 音源信息
type VoiceSourceVO struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Type string `json:"type"`
	Language string `json:"language"`
	SampleRate int `json:"sampleRate"`
}
