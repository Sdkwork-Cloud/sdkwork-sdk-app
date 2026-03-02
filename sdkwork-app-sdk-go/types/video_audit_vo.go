package types

// 视频审核响应
type VideoAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Status string `json:"status"`
	VideoUrl string `json:"videoUrl"`
	Duration int `json:"duration"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	KeyFrameResults []KeyFrameResult `json:"keyFrameResults"`
	AudioResult AudioAuditVO `json:"audioResult"`
	Suggestion string `json:"suggestion"`
}
