package types

// 语音翻译请求
type AudioTranslationForm struct {
	AudioUrl string `json:"audioUrl"`
	TargetLanguage string `json:"targetLanguage"`
	Model string `json:"model"`
	SourceLanguage string `json:"sourceLanguage"`
	Format string `json:"format"`
}
