package types

// 创建合作伙伴表单
type PartnerCreateForm struct {
	Name string `json:"name"`
	ContactName string `json:"contactName"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	Level string `json:"level"`
	ParentId int `json:"parentId"`
}
