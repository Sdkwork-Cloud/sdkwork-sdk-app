package types


type VipStatusVO struct {
	IsVip bool `json:"isVip"`
	VipLevel int `json:"vipLevel"`
	ExpireTime string `json:"expireTime"`
	PointBalance int `json:"pointBalance"`
}
