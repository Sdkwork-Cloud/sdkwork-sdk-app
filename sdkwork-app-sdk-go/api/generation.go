package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type GenerationApi struct {
    client *sdkhttp.Client
}

func NewGenerationApi(client *sdkhttp.Client) *GenerationApi {
    return &GenerationApi{client: client}
}

// Enhance generation prompt
func (a *GenerationApi) EnhanceGenerationPrompt(body sdktypes.PromptEnhanceRequest) (sdktypes.PlusApiResultPromptEnhanceResponse, error) {
    raw, err := a.client.Post(AppApiPath("/generation/prompt/enhance"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPromptEnhanceResponse
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPromptEnhanceResponse](raw)
}
