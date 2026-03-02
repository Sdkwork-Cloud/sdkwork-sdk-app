package types

// 音乐混音请求
type MusicRemixForm struct {
	MusicUrl string `json:"musicUrl"`
	Style string `json:"style"`
	Model string `json:"model"`
}
