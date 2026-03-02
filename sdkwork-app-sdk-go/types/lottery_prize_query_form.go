package types

// 中奖记录查询请求
type LotteryPrizeQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	ClaimStatus string `json:"claimStatus"`
	Size int `json:"size"`
	Page int `json:"page"`
}
