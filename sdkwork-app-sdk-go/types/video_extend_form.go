package types

// 视频延长请求
type VideoExtendForm struct {
	VideoUrl string `json:"videoUrl"`
	ExtendDuration int `json:"extendDuration"`
	Model string `json:"model"`
	Style string `json:"style"`
}
