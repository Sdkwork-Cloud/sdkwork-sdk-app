package types

// 审核记录详情响应
type AuditRecordDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	ContentId string `json:"contentId"`
	ContentType string `json:"contentType"`
	OriginalContent string `json:"originalContent"`
	ProcessedContent string `json:"processedContent"`
	UserId string `json:"userId"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	Confidence float64 `json:"confidence"`
	DetectionResults []DetectionResult `json:"detectionResults"`
	CheckTypes []string `json:"checkTypes"`
	Scene string `json:"scene"`
	DeviceInfo map[string]interface{} `json:"deviceInfo"`
	IpAddress string `json:"ipAddress"`
	Location string `json:"location"`
	AuditTime string `json:"auditTime"`
	ProcessTime int `json:"processTime"`
	HasAppeal bool `json:"hasAppeal"`
}
