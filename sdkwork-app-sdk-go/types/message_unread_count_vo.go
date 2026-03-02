package types

// 未读消息数响应
type MessageUnreadCountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalUnread int `json:"totalUnread"`
	PrivateUnread int `json:"privateUnread"`
	SystemUnread int `json:"systemUnread"`
}
