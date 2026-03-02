package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class GenerationApi {
    private final HttpClient client;
    
    public GenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Enhance generation prompt */
    public PlusApiResultPromptEnhanceResponse enhanceGenerationPrompt(PromptEnhanceRequest body) throws Exception {
        return (PlusApiResultPromptEnhanceResponse) client.post(ApiPaths.appPath("/generation/prompt/enhance"), body);
    }
}
