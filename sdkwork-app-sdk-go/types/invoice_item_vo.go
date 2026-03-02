package types

// 发票明细项响应
type InvoiceItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ItemId string `json:"itemId"`
	ProductName string `json:"productName"`
	Specification string `json:"specification"`
	Unit string `json:"unit"`
	Quantity float64 `json:"quantity"`
	UnitPriceExcludingTax float64 `json:"unitPriceExcludingTax"`
	AmountExcludingTax float64 `json:"amountExcludingTax"`
	TaxAmount float64 `json:"taxAmount"`
	TotalAmount float64 `json:"totalAmount"`
	TaxRate float64 `json:"taxRate"`
}
