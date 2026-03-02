package types

// 视频风格转换请求
type VideoStyleTransferForm struct {
	VideoUrl string `json:"videoUrl"`
	Style string `json:"style"`
	Model string `json:"model"`
}
