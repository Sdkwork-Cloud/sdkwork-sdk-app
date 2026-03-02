package types

// 用户活动VO
type UserActivityVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ActivityId string `json:"activityId"`
	UserId string `json:"userId"`
	ActivityType string `json:"activityType"`
	ActivityName string `json:"activityName"`
	Timestamp string `json:"timestamp"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
	PageUrl string `json:"pageUrl"`
	Referrer string `json:"referrer"`
}
