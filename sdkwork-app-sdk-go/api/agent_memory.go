package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AgentMemoryApi struct {
    client *sdkhttp.Client
}

func NewAgentMemoryApi(client *sdkhttp.Client) *AgentMemoryApi {
    return &AgentMemoryApi{client: client}
}

// List memories
func (a *AgentMemoryApi) List(agentId string, query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory", agentId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Create memory
func (a *AgentMemoryApi) Create(agentId string, body *sdktypes.CreatePostRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/memory", agentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Summarize session
func (a *AgentMemoryApi) SummarizeSession(agentId string, sessionId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/memory/sessions/%s/summarize", agentId, sessionId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List knowledge
func (a *AgentMemoryApi) ListKnowledge(agentId string) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Create knowledge
func (a *AgentMemoryApi) CreateKnowledge(agentId string, body *sdktypes.CreateKnowledgeRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge", agentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Consolidate memories
func (a *AgentMemoryApi) Consolidate(agentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/memory/consolidate", agentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Memory stats
func (a *AgentMemoryApi) Stats(agentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/stats", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List session history
func (a *AgentMemoryApi) ListSessionHistory(agentId string, sessionId string, query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/sessions/%s/history", agentId, sessionId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Search memories
func (a *AgentMemoryApi) Search(agentId string, query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/search", agentId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Get knowledge
func (a *AgentMemoryApi) GetKnowledge(agentId string, documentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge/%s", agentId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Delete knowledge
func (a *AgentMemoryApi) DeleteKnowledge(agentId string, documentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge/%s", agentId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List knowledge chunks
func (a *AgentMemoryApi) ListKnowledgeChunks(agentId string, documentId string) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge/%s/chunks", agentId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Knowledge stats
func (a *AgentMemoryApi) KnowledgeStats(agentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge/stats", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Search knowledge
func (a *AgentMemoryApi) SearchKnowledge(agentId string, query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/memory/knowledge/search", agentId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Delete memory
func (a *AgentMemoryApi) Delete(agentId string, memoryId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/agents/%s/memory/%s", agentId, memoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Clear session memories
func (a *AgentMemoryApi) ClearSession(agentId string, sessionId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/agents/%s/memory/sessions/%s", agentId, sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}
