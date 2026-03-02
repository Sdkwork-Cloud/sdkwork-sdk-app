package types


type AnnouncementDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AnnouncementId string `json:"announcementId"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	Status string `json:"status"`
	Author string `json:"author"`
	PublishTime string `json:"publishTime"`
	ExpireTime string `json:"expireTime"`
	ViewCount int `json:"viewCount"`
	IsTop bool `json:"isTop"`
	CoverImage string `json:"coverImage"`
}
