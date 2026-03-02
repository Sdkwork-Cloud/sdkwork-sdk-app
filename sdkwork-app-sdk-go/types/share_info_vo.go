package types

// 分享信息响应
type ShareInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ShareId string `json:"shareId"`
	ShareType string `json:"shareType"`
	Title string `json:"title"`
	Description string `json:"description"`
	ImageUrl string `json:"imageUrl"`
	ShareUrl string `json:"shareUrl"`
	CreateTime string `json:"createTime"`
	ExpireTime string `json:"expireTime"`
	Status string `json:"status"`
	VisitCount int `json:"visitCount"`
}
