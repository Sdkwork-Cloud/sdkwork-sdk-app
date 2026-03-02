package types


type MaintenanceNoticeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NoticeId string `json:"noticeId"`
	Title string `json:"title"`
	Content string `json:"content"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Status string `json:"status"`
	MaintenanceType string `json:"maintenanceType"`
	AffectedServices string `json:"affectedServices"`
	ContactInfo string `json:"contactInfo"`
	IsEmergency bool `json:"isEmergency"`
}
