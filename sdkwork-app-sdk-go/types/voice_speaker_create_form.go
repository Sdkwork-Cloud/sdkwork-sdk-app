package types

// 发音人创建请求
type VoiceSpeakerCreateForm struct {
	Name string `json:"name"`
	LocalName string `json:"localName"`
	Code string `json:"code"`
	FaceImageUrl string `json:"faceImageUrl"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Gender string `json:"gender"`
	AgeType string `json:"ageType"`
	Type string `json:"type"`
	Models []string `json:"models"`
	ChannelSpeakerId string `json:"channelSpeakerId"`
	Version string `json:"version"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
}
