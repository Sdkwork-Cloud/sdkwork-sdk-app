package types

// Contact query request
type ContactQueryForm struct {
	Keyword string `json:"keyword"`
	Region string `json:"region"`
	IsOnline bool `json:"isOnline"`
}
