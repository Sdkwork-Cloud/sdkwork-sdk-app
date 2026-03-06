package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ToolApi struct {
    client *sdkhttp.Client
}

func NewToolApi(client *sdkhttp.Client) *ToolApi {
    return &ToolApi{client: client}
}

// Update tool credentials
func (a *ToolApi) UpdateCredentials(toolId string, body *sdktypes.UpdateCredentialsRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/tools/my/%s/credentials", toolId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List my tools
func (a *ToolApi) ListMine() (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/tools/my"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Install tool
func (a *ToolApi) Install(body *sdktypes.InstallRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath("/tools/my"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Test tool
func (a *ToolApi) Test(toolId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/tools/market/%s/test", toolId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List tool market
func (a *ToolApi) ListMarket(query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/tools/market"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Get tool market item
func (a *ToolApi) GetMarketItem(toolId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/tools/market/%s", toolId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List tool categories
func (a *ToolApi) ListCategories() (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/tools/categories"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}

// Uninstall tool
func (a *ToolApi) Uninstall(toolId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/tools/my/%s", toolId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
