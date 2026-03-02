package types

// 图生视频请求
type ImageToVideoForm struct {
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
	Duration int `json:"duration"`
	Width int `json:"width"`
	Height int `json:"height"`
	Format string `json:"format"`
	MotionStrength int `json:"motionStrength"`
	CameraMotion string `json:"cameraMotion"`
	AudioUrls []string `json:"audioUrls"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
