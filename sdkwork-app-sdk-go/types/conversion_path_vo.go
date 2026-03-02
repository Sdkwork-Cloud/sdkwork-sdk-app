package types

// 转化路径VO
type ConversionPathVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PathId string `json:"pathId"`
	Steps []string `json:"steps"`
	ConversionCount int `json:"conversionCount"`
	ConversionRate float64 `json:"conversionRate"`
	AverageTime float64 `json:"averageTime"`
	StartPage string `json:"startPage"`
	EndPage string `json:"endPage"`
}
