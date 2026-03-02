package types


type OnboardingPageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PageId string `json:"pageId"`
	Title string `json:"title"`
	Description string `json:"description"`
	Images []string `json:"images"`
	Buttons []string `json:"buttons"`
	BackgroundColor string `json:"backgroundColor"`
	TextColor string `json:"textColor"`
	IsActive bool `json:"isActive"`
	Order int `json:"order"`
}
