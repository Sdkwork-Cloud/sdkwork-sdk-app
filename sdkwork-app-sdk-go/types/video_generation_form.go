package types

// 视频生成请求
type VideoGenerationForm struct {
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
	Duration int `json:"duration"`
	Fps int `json:"fps"`
	Format string `json:"format"`
	Style string `json:"style"`
	AspectRatio string `json:"aspectRatio"`
	MotionStrength int `json:"motionStrength"`
	CameraMotion string `json:"cameraMotion"`
	Loop bool `json:"loop"`
	Hd bool `json:"hd"`
	AudioUrls []string `json:"audioUrls"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
