package types

// 分享记录响应
type ShareRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	ShareId string `json:"shareId"`
	ShareType string `json:"shareType"`
	Title string `json:"title"`
	CreateTime string `json:"createTime"`
	ExpireTime string `json:"expireTime"`
	Status string `json:"status"`
	VisitCount int `json:"visitCount"`
}
