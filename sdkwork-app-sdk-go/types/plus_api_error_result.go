package types


type PlusApiErrorResult struct {
	Code int `json:"code"`
	Msg string `json:"msg"`
	Data interface{} `json:"data"`
	Timestamp string `json:"timestamp"`
	TraceId string `json:"traceId"`
}
