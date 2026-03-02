package types

// 音乐延长请求
type MusicExtendForm struct {
	MusicUrl string `json:"musicUrl"`
	ExtendDuration int `json:"extendDuration"`
	Model string `json:"model"`
	Style string `json:"style"`
}
