package types


type PromptEnhanceResponse struct {
	Prompt string `json:"prompt"`
	TokensEstimated int `json:"tokensEstimated"`
}
