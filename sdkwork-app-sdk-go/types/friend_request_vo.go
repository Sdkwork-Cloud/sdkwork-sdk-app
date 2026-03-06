package types

// Friend request item
type FriendRequestVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	FromId string `json:"fromId"`
	FromName string `json:"fromName"`
	FromAvatar string `json:"fromAvatar"`
	ToId string `json:"toId"`
	Status string `json:"status"`
	Message string `json:"message"`
}
