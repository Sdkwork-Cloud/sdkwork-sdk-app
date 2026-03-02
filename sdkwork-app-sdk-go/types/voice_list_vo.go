package types

// 语音列表响应
type VoiceListVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Voices []VoiceItem `json:"voices"`
}
