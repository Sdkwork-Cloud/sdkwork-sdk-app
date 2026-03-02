package types

// 音效生成响应
type SoundEffectGenerationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	SoundEffectId string `json:"soundEffectId"`
	Name string `json:"name"`
	Description string `json:"description"`
	AudioUrl string `json:"audioUrl"`
	WaveformUrl string `json:"waveformUrl"`
	Category string `json:"category"`
	Duration int `json:"duration"`
	Status string `json:"status"`
	CompletedAt string `json:"completedAt"`
}
