package types


type SpeakerStatisticsVO struct {
	TotalSpeakers int `json:"totalSpeakers"`
	ActiveSpeakers int `json:"activeSpeakers"`
	InactiveSpeakers int `json:"inactiveSpeakers"`
}
