package types

// 公告VO
type AnnouncementVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AnnouncementId string `json:"announcementId"`
	Title string `json:"title"`
	Type string `json:"type"`
	Status string `json:"status"`
	PublishTime string `json:"publishTime"`
	ExpireTime string `json:"expireTime"`
	ViewCount int `json:"viewCount"`
	IsTop bool `json:"isTop"`
	CoverImage string `json:"coverImage"`
}
