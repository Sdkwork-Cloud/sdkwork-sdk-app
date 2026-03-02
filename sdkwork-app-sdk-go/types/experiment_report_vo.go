package types

// 实验报告响应
type ExperimentReportVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExperimentKey string `json:"experimentKey"`
	ReportType string `json:"reportType"`
	ReportData map[string]interface{} `json:"reportData"`
	GeneratedAt string `json:"generatedAt"`
	Version string `json:"version"`
}
