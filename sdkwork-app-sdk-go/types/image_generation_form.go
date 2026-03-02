package types

// 图片生成请求
type ImageGenerationForm struct {
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
	Width int `json:"width"`
	Height int `json:"height"`
	Size string `json:"size"`
	Quality string `json:"quality"`
	Style string `json:"style"`
	Format string `json:"format"`
	CfgScale float64 `json:"cfgScale"`
	Steps int `json:"steps"`
	Sampler string `json:"sampler"`
	Strength float64 `json:"strength"`
	MaskAssets []AssetMediaResource `json:"maskAssets"`
	SafetyChecker bool `json:"safetyChecker"`
	AspectRatio string `json:"aspectRatio"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
