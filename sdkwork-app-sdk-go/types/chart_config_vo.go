package types

// 图表配置
type ChartConfigVO struct {
	ShowLegend bool `json:"showLegend"`
	ShowTooltip bool `json:"showTooltip"`
	Responsive bool `json:"responsive"`
	Height int `json:"height"`
}
