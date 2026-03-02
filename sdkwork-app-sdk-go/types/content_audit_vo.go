package types

// 综合内容审核响应
type ContentAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	ContentId string `json:"contentId"`
	OverallResult string `json:"overallResult"`
	RiskLevel string `json:"riskLevel"`
	Results map[string]AuditResultItem `json:"results"`
	TextResult TextAuditVO `json:"textResult"`
	ImageResults []ImageAuditVO `json:"imageResults"`
	VideoResult VideoAuditVO `json:"videoResult"`
	AudioResult AudioAuditVO `json:"audioResult"`
	Suggestion string `json:"suggestion"`
}
