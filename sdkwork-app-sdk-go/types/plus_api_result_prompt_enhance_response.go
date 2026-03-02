package types


type PlusApiResultPromptEnhanceResponse struct {
	Code int `json:"code"`
	Msg string `json:"msg"`
	Data PromptEnhanceResponse `json:"data"`
	Timestamp string `json:"timestamp"`
	TraceId string `json:"traceId"`
}
