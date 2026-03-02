package types

// 数据集
type DatasetVO struct {
	Label string `json:"label"`
	Data []interface{} `json:"data"`
	BackgroundColor []string `json:"backgroundColor"`
	BorderColor []string `json:"borderColor"`
	BorderWidth int `json:"borderWidth"`
}
