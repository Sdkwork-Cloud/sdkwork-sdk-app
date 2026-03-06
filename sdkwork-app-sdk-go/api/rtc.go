package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type RtcApi struct {
    client *sdkhttp.Client
}

func NewRtcApi(client *sdkhttp.Client) *RtcApi {
    return &RtcApi{client: client}
}

// Create RTC room
func (a *RtcApi) CreateRoom(body *sdktypes.CreateRoomRequest) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath("/rtc/rooms"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// Create RTC room token
func (a *RtcApi) CreateRoomToken(roomId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/rtc/rooms/%s/token", roomId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// End RTC room
func (a *RtcApi) EndRoom(roomId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/rtc/rooms/%s/end", roomId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Get RTC room
func (a *RtcApi) GetRoom(roomId string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/rtc/rooms/%s", roomId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// List RTC records
func (a *RtcApi) ListRecords(query map[string]interface{}) (sdktypes.PlusApiResultListMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/rtc/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMapStringObject](raw)
}
