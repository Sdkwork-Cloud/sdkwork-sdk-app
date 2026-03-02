package types

// 发票响应
type InvoiceVO struct {
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
	TotalAmount float64 `json:"totalAmount"`
	Currency string `json:"currency"`
}
