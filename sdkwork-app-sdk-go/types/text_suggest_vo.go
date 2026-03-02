package types

// 文本替换建议响应
type TextSuggestVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OriginalText string `json:"originalText"`
	SuggestedText string `json:"suggestedText"`
	ReplacementCount int `json:"replacementCount"`
	Positions []ReplacementPosition `json:"positions"`
	AlternativeSuggestions []string `json:"alternativeSuggestions"`
}
