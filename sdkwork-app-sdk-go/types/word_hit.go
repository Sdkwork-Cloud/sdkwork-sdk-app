package types

// 敏感词命中
type WordHit struct {
	Word string `json:"word"`
	StartIndex int `json:"startIndex"`
	EndIndex int `json:"endIndex"`
	Category string `json:"category"`
	Severity string `json:"severity"`
}
