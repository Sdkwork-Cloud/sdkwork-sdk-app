package types

// 积分商品查询请求
type PointsGoodsQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Category string `json:"category"`
	MinPoints int `json:"minPoints"`
	MaxPoints int `json:"maxPoints"`
	Exchangeable bool `json:"exchangeable"`
	Size int `json:"size"`
	Page int `json:"page"`
}
