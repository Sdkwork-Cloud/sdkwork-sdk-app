package types

// 音效生成请求
type SoundEffectGenerationForm struct {
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
	Description string `json:"description"`
	Category string `json:"category"`
	Duration int `json:"duration"`
	Format string `json:"format"`
	Loop bool `json:"loop"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
