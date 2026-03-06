package types

// Prompt enhance response
type PromptEnhanceResponse struct {
	Prompt string `json:"prompt"`
	TokensEstimated int `json:"tokensEstimated"`
}
