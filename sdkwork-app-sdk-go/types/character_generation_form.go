package types

// 虚拟角色生成请求
type CharacterGenerationForm struct {
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
	Style string `json:"style"`
	Pose string `json:"pose"`
	Expression string `json:"expression"`
	Gender string `json:"gender"`
	Age string `json:"age"`
	Clothing string `json:"clothing"`
	Width int `json:"width"`
	Height int `json:"height"`
	Format string `json:"format"`
	Hd bool `json:"hd"`
	Type string `json:"type"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
