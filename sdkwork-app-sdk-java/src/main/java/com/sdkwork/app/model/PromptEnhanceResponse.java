package com.sdkwork.app.model;

public class PromptEnhanceResponse {
    private String prompt;
    private Integer tokensEstimated;

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Integer getTokensEstimated() {
        return this.tokensEstimated;
    }
    
    public void setTokensEstimated(Integer tokensEstimated) {
        this.tokensEstimated = tokensEstimated;
    }
}
