package types

// 更新合作伙伴表单
type PartnerUpdateForm struct {
	Name string `json:"name"`
	ContactName string `json:"contactName"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
}
