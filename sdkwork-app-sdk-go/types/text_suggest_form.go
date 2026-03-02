package types

// 文本替换建议请求
type TextSuggestForm struct {
	Text string `json:"text"`
	SuggestType string `json:"suggestType"`
	Scene string `json:"scene"`
}
