package types

// 分类详情响应
type CategoryDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	ParentName string `json:"parentName"`
	Sort int `json:"sort"`
	Status int `json:"status"`
	Type string `json:"type"`
	GroupName string `json:"groupName"`
	Visible int `json:"visible"`
}
