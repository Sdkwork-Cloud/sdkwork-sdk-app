package types

// 实验反馈请求
type ExperimentFeedbackForm struct {
	ExperimentKey string `json:"experimentKey"`
	FeedbackType string `json:"feedbackType"`
	FeedbackContent string `json:"feedbackContent"`
	Rating int `json:"rating"`
}
