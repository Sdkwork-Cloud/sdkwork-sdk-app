package types


type PromptEnhanceRequest struct {
	Prompt string `json:"prompt"`
	Scene string `json:"scene"`
	Style string `json:"style"`
	Language string `json:"language"`
	MaxWords int `json:"maxWords"`
}
