package types

// 更新发票表单
type InvoiceUpdateForm struct {
	Title string `json:"title"`
	TaxNo string `json:"taxNo"`
	BankName string `json:"bankName"`
	BankAccount string `json:"bankAccount"`
	RegisterAddress string `json:"registerAddress"`
	RegisterPhone string `json:"registerPhone"`
}
