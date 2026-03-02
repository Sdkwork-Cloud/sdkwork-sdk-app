package types

// 语音合成请求(TTS)
type AudioGenerationForm struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	Model string `json:"model"`
	Channel string `json:"channel"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Async bool `json:"async"`
	CallbackUrl string `json:"callbackUrl"`
	ExtraParams map[string]interface{} `json:"extraParams"`
	BizScene string `json:"bizScene"`
	BizId int `json:"bizId"`
	ConversationId int `json:"conversationId"`
	MessageId int `json:"messageId"`
	Text string `json:"text"`
	Voice string `json:"voice"`
	Language string `json:"language"`
	Speed float64 `json:"speed"`
	Pitch float64 `json:"pitch"`
	Volume int `json:"volume"`
	Format string `json:"format"`
	Emotion string `json:"emotion"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
