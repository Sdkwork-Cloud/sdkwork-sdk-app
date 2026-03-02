package types

// 活动参与记录
type ActivityRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	ActivityId string `json:"activityId"`
	ActivityTitle string `json:"activityTitle"`
	ActivityType string `json:"activityType"`
	ParticipateTime string `json:"participateTime"`
	Status string `json:"status"`
	Result string `json:"result"`
	Rewards map[string]interface{} `json:"rewards"`
}
