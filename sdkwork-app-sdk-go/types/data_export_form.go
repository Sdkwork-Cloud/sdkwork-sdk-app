package types

// 导出用户数据请求
type DataExportForm struct {
	Format string `json:"format"`
	DataType string `json:"dataType"`
	IncludeMedia bool `json:"includeMedia"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Email string `json:"email"`
}
