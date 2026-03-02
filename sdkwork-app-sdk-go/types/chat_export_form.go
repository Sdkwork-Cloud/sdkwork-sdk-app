package types

// 导出对话请求
type ChatExportForm struct {
	Format string `json:"format"`
	Scope string `json:"scope"`
	Count int `json:"count"`
	IncludeThinking bool `json:"includeThinking"`
	IncludeSystemMessages bool `json:"includeSystemMessages"`
	IncludeAttachments bool `json:"includeAttachments"`
	FileName string `json:"fileName"`
}
