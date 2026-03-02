package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AddressApi struct {
    client *sdkhttp.Client
}

func NewAddressApi(client *sdkhttp.Client) *AddressApi {
    return &AddressApi{client: client}
}

// 获取地址详情
func (a *AddressApi) GetAddressDetail(addressId string) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 更新地址
func (a *AddressApi) UpdateAddress(addressId string, body sdktypes.UserAddressUpdateForm) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 删除地址
func (a *AddressApi) DeleteAddress(addressId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 设置默认地址
func (a *AddressApi) SetDefault(addressId string) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/user/address/%s/default", addressId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 获取地址列表
func (a *AddressApi) ListAddresses() (sdktypes.PlusApiResultListUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/address"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListUserAddressVO](raw)
}

// 创建地址
func (a *AddressApi) CreateAddress(body sdktypes.UserAddressCreateForm) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Post(AppApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 获取默认地址
func (a *AddressApi) GetDefault() (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/address/default"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}
