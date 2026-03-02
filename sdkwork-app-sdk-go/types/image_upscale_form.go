package types

// 图片放大请求
type ImageUpscaleForm struct {
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
	Scale int `json:"scale"`
	TargetWidth int `json:"targetWidth"`
	TargetHeight int `json:"targetHeight"`
	Format string `json:"format"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
