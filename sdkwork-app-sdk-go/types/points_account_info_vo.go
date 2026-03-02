package types

// 积分账户信息响应
type PointsAccountInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccountId string `json:"accountId"`
	AccountType string `json:"accountType"`
	AccountTypeName string `json:"accountTypeName"`
	OwnerId string `json:"ownerId"`
	UserId string `json:"userId"`
	AvailablePoints int `json:"availablePoints"`
	FrozenPoints int `json:"frozenPoints"`
	TotalPoints int `json:"totalPoints"`
	TokenBalance int `json:"tokenBalance"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	PendingPoints int `json:"pendingPoints"`
	TotalEarned int `json:"totalEarned"`
	TotalSpent int `json:"totalSpent"`
	Level int `json:"level"`
	LevelName string `json:"levelName"`
	Experience int `json:"experience"`
}
