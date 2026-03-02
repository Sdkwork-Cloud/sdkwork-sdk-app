package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class GenerationApi(private val client: HttpClient) {

    /** Enhance generation prompt */
    suspend fun enhanceGenerationPrompt(body: PromptEnhanceRequest): PlusApiResultPromptEnhanceResponse? {
        return client.post(ApiPaths.appPath("/generation/prompt/enhance"), body) as? PlusApiResultPromptEnhanceResponse
    }
}
