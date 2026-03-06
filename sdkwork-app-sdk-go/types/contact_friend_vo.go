package types

// Contact friend item
type ContactFriendVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Name string `json:"name"`
	Avatar string `json:"avatar"`
	Status string `json:"status"`
	IsOnline bool `json:"isOnline"`
	Remark string `json:"remark"`
	Signature string `json:"signature"`
	Region string `json:"region"`
	Initial string `json:"initial"`
}
