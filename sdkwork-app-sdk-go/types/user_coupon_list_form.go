package types

// 用户优惠券列表查询请求
type UserCouponListForm struct {
	Status string `json:"status"`
	Type string `json:"type"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
