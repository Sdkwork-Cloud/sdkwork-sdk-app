package types

// 实时内容审核请求
type RealtimeAuditForm struct {
	StreamId string `json:"streamId"`
	StreamUrl string `json:"streamUrl"`
	StreamType string `json:"streamType"`
	RoomId string `json:"roomId"`
	PublisherId string `json:"publisherId"`
	CheckTypes []string `json:"checkTypes"`
	CallbackUrl string `json:"callbackUrl"`
	CheckAudio bool `json:"checkAudio"`
	CheckVideo bool `json:"checkVideo"`
}
