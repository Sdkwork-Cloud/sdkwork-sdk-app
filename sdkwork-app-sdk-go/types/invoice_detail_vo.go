package types

// 发票详情响应
type InvoiceDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	InvoiceId string `json:"invoiceId"`
	Title string `json:"title"`
	TitleType string `json:"titleType"`
	TaxNo string `json:"taxNo"`
	Type string `json:"type"`
	Status string `json:"status"`
	InvoiceCode string `json:"invoiceCode"`
	InvoiceNo string `json:"invoiceNo"`
	AmountExcludingTax float64 `json:"amountExcludingTax"`
	TaxAmount float64 `json:"taxAmount"`
	TotalAmount float64 `json:"totalAmount"`
	TaxRate float64 `json:"taxRate"`
	Currency string `json:"currency"`
	BankName string `json:"bankName"`
	BankAccount string `json:"bankAccount"`
	RegisterAddress string `json:"registerAddress"`
	RegisterPhone string `json:"registerPhone"`
	ElectronicUrl string `json:"electronicUrl"`
	InvoiceTime string `json:"invoiceTime"`
	Items []InvoiceItemVO `json:"items"`
}
