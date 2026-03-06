package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AgentApi struct {
    client *sdkhttp.Client
}

func NewAgentApi(client *sdkhttp.Client) *AgentApi {
    return &AgentApi{client: client}
}

// Get agent
func (a *AgentApi) Get(agentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Update agent
func (a *AgentApi) Update(agentId string, body *sdktypes.UpdateRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/agents/%s", agentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Delete agent
func (a *AgentApi) Delete(agentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/agents/%s", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// List agents
func (a *AgentApi) List(query map[string]interface{}) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/agents"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Create agent
func (a *AgentApi) Create(body *sdktypes.CreateRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath("/agents"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List sessions
func (a *AgentApi) ListSessions(agentId string) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/sessions", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Create session
func (a *AgentApi) CreateSession(agentId string, body *sdktypes.CreateSessionRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/sessions", agentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Reset agent
func (a *AgentApi) Reset(agentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/%s/reset", agentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// List session messages
func (a *AgentApi) ListSessionMessages(sessionId string) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/sessions/%s/messages", sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Send session message
func (a *AgentApi) SendSessionMessage(sessionId string, body *sdktypes.SendSessionMessageRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/sessions/%s/messages", sessionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Clear session
func (a *AgentApi) ClearSession(sessionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/agents/sessions/%s/clear", sessionId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Agent stats
func (a *AgentApi) Stats(agentId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/agents/%s/stats", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Delete session
func (a *AgentApi) DeleteSession(sessionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/agents/sessions/%s", sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
