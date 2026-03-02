package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type MemberApi struct {
    client *sdkhttp.Client
}

func NewMemberApi(client *sdkhttp.Client) *MemberApi {
    return &MemberApi{client: client}
}

// 获取成员详情
func (a *MemberApi) GetMember(memberId string) (sdktypes.PlusApiResultMemberVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/member/%s", memberId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMemberVO](raw)
}
