package types

// 路径分析查询请求
type PathAnalysisQueryForm struct {
	StartDate string `json:"startDate"`
	EndDate string `json:"endDate"`
	StartPage string `json:"startPage"`
	EndPage string `json:"endPage"`
	MaxSteps int `json:"maxSteps"`
	DeviceType string `json:"deviceType"`
	OsType string `json:"osType"`
}
