package types

// 路径步骤VO
type PathStepVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PageUrl string `json:"pageUrl"`
	PageTitle string `json:"pageTitle"`
	UserCount int `json:"userCount"`
	Percentage float64 `json:"percentage"`
	NextSteps []PathStepVO `json:"nextSteps"`
}
