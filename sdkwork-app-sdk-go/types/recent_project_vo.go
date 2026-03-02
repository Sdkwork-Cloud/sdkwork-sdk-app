package types

// 最近项目响应
type RecentProjectVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Cover string `json:"cover"`
	Type string `json:"type"`
	Status string `json:"status"`
	Url string `json:"url"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	MemberCount int `json:"memberCount"`
	FileCount int `json:"fileCount"`
	Size int `json:"size"`
	Tags []string `json:"tags"`
	IsPublic bool `json:"isPublic"`
	IsFavorite bool `json:"isFavorite"`
}
