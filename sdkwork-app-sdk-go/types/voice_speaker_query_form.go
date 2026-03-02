package types

// 发音人查询请求
type VoiceSpeakerQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Keyword string `json:"keyword"`
	Gender string `json:"gender"`
	AgeType string `json:"ageType"`
	Type string `json:"type"`
	Channel string `json:"channel"`
	Status string `json:"status"`
}
