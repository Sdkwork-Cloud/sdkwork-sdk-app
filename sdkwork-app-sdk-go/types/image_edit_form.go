package types

// 图片编辑请求
type ImageEditForm struct {
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
	MaskAssets []AssetMediaResource `json:"maskAssets"`
	Strength float64 `json:"strength"`
	Format string `json:"format"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
