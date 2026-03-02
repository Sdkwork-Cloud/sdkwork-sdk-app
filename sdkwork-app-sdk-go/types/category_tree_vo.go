package types

// 分类树响应
type CategoryTreeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Icon string `json:"icon"`
	ParentId int `json:"parentId"`
	Sort int `json:"sort"`
	Status int `json:"status"`
	Children []CategoryTreeVO `json:"children"`
}
