package types

// 音乐生成请求
type MusicGenerationForm struct {
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
	Lyrics string `json:"lyrics"`
	Duration int `json:"duration"`
	Genre string `json:"genre"`
	Style string `json:"style"`
	Tempo int `json:"tempo"`
	Key string `json:"key"`
	Mood string `json:"mood"`
	Instruments string `json:"instruments"`
	Format string `json:"format"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
