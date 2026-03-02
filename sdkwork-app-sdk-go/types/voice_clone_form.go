package types

// 语音克隆请求
type VoiceCloneForm struct {
	SampleAudioUrl string `json:"sampleAudioUrl"`
	Text string `json:"text"`
	Model string `json:"model"`
	Format string `json:"format"`
}
