package types

// 音频审核请求
type AudioAuditForm struct {
	AudioUrl string `json:"audioUrl"`
	Format string `json:"format"`
	ContentId string `json:"contentId"`
	Duration int `json:"duration"`
	CheckTypes []string `json:"checkTypes"`
	SampleRate int `json:"sampleRate"`
}
