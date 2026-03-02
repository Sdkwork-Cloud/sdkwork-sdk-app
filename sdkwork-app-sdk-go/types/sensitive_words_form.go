package types

// 敏感词检测请求
type SensitiveWordsForm struct {
	Text string `json:"text"`
	WordListType string `json:"wordListType"`
	Mode string `json:"mode"`
	Replacement string `json:"replacement"`
	Categories []string `json:"categories"`
}
