package types

// 语音转文字审核请求
type AudioAsrAuditForm struct {
	AudioUrl string `json:"audioUrl"`
	ContentId string `json:"contentId"`
	Language string `json:"language"`
	CheckTypes []string `json:"checkTypes"`
	WithTimestamp bool `json:"withTimestamp"`
}
