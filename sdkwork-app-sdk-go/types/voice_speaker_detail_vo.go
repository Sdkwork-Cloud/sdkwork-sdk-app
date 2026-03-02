package types

// 发音人详情响应
type VoiceSpeakerDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	LocalName string `json:"localName"`
	Code string `json:"code"`
	FaceImageUrl string `json:"faceImageUrl"`
	FaceVideoUrl string `json:"faceVideoUrl"`
	ResourceUrls []string `json:"resourceUrls"`
	Channel string `json:"channel"`
	ChannelName string `json:"channelName"`
	Product string `json:"product"`
	Gender string `json:"gender"`
	GenderName string `json:"genderName"`
	AgeType string `json:"ageType"`
	AgeTypeName string `json:"ageTypeName"`
	Type string `json:"type"`
	TypeName string `json:"typeName"`
	Models []string `json:"models"`
	ChannelSpeakerId string `json:"channelSpeakerId"`
	Version string `json:"version"`
	IsDefault bool `json:"isDefault"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	VoiceSources []VoiceSourceVO `json:"voiceSources"`
	SampleAudios []string `json:"sampleAudios"`
	Attributes map[string]interface{} `json:"attributes"`
}
