package types

// 店铺查询请求
type ShopQueryForm struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Keyword string `json:"keyword"`
	Status string `json:"status"`
}
