package types

// 优惠券列表查询请求
type CouponListForm struct {
	Type string `json:"type"`
	Status string `json:"status"`
	Keyword string `json:"keyword"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
