package types

// 语音转文本请求
type AudioTranscriptionForm struct {
	AudioUrl string `json:"audioUrl"`
	Model string `json:"model"`
	Language string `json:"language"`
	Format string `json:"format"`
}
