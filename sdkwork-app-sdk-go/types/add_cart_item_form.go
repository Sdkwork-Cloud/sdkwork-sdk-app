package types

// 添加购物车项请求
type AddCartItemForm struct {
	SkuId int `json:"skuId"`
	ProductId int `json:"productId"`
	Quantity int `json:"quantity"`
	CartGroupUuid string `json:"cartGroupUuid"`
}
