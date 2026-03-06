package types

// Contact stats
type ContactStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Total int `json:"total"`
	Online int `json:"online"`
	NewToday int `json:"newToday"`
}
