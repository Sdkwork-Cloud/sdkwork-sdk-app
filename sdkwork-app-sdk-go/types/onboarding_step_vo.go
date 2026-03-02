package types

// 入职步骤信息
type OnboardingStepVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	Order int `json:"order"`
	Completed bool `json:"completed"`
	CompleteTime string `json:"completeTime"`
}
