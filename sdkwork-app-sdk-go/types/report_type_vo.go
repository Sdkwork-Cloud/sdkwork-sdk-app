package types

// 报告类型VO
type ReportTypeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ReportTypeId string `json:"reportTypeId"`
	ReportName string `json:"reportName"`
	ReportType string `json:"reportType"`
	Description string `json:"description"`
	Enabled bool `json:"enabled"`
	Icon string `json:"icon"`
}
