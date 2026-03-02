package types

// 统计导出请求
type StatsExportForm struct {
	ReportType string `json:"reportType"`
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	Format string `json:"format"`
	Email string `json:"email"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
}
