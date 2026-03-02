package types

// 公告查询Form
type AnnouncementQueryForm struct {
	Type string `json:"type"`
	Status string `json:"status"`
	PageSize int `json:"pageSize"`
	PageNum int `json:"pageNum"`
}
