package types

// 生成相似音乐请求
type MusicSimilarForm struct {
	ReferenceUrl string `json:"referenceUrl"`
	Duration int `json:"duration"`
	Model string `json:"model"`
}
