package types

// 拉黑检查响应
type BlockCheckVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	IsBlocked bool `json:"isBlocked"`
	BlockTime string `json:"blockTime"`
	BlockReason string `json:"blockReason"`
}
