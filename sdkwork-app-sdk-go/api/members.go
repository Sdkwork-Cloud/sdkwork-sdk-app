package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type MembersApi struct {
    client *sdkhttp.Client
}

func NewMembersApi(client *sdkhttp.Client) *MembersApi {
    return &MembersApi{client: client}
}

// 获取组织成员
func (a *MembersApi) GetMembersByOrg(orgId string, query map[string]interface{}) (sdktypes.PlusApiResultPageMemberVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/members", orgId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMemberVO](raw)
}
