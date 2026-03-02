package types

// 语音列表查询请求
type VoiceListQueryForm struct {
	Language string `json:"language"`
	Gender string `json:"gender"`
	Style string `json:"style"`
	AgeRange string `json:"ageRange"`
}
