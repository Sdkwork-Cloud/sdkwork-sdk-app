package types

// 奖励验证请求
type RewardVerifyForm struct {
	AdvertId string `json:"advertId"`
	RewardId string `json:"rewardId"`
	VerificationToken string `json:"verificationToken"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
}
