package types

// 替换位置
type ReplacementPosition struct {
	Start int `json:"start"`
	End int `json:"end"`
	Original string `json:"original"`
	Replacement string `json:"replacement"`
}
