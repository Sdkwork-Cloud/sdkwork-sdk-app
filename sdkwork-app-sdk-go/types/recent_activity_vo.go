package types

// 最近活动响应
type RecentActivityVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	Title string `json:"title"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Url string `json:"url"`
	Status string `json:"status"`
	ResourceId string `json:"resourceId"`
	ResourceType string `json:"resourceType"`
	Creator string `json:"creator"`
	CreateTime string `json:"createTime"`
	Read bool `json:"read"`
	Priority int `json:"priority"`
}
