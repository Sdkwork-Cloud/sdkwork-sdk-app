package types

// 创建发票表单
type InvoiceCreateForm struct {
	Title string `json:"title"`
	TitleType string `json:"titleType"`
	TaxNo string `json:"taxNo"`
	Type string `json:"type"`
	TotalAmount float64 `json:"totalAmount"`
}
