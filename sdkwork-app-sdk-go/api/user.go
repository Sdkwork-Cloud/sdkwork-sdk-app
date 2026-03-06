package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type UserApi struct {
    client *sdkhttp.Client
}

func NewUserApi(client *sdkhttp.Client) *UserApi {
    return &UserApi{client: client}
}

// 获取用户设置
func (a *UserApi) GetUserSettings() (sdktypes.PlusApiResultUserSettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserSettingsVO](raw)
}

// 更新用户设置
func (a *UserApi) UpdateUserSettings(body sdktypes.UserSettingsUpdateForm) (sdktypes.PlusApiResultUserSettingsVO, error) {
    raw, err := a.client.Put(AppApiPath("/user/settings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserSettingsVO](raw)
}

// 获取用户信息
func (a *UserApi) GetUserProfile() (sdktypes.PlusApiResultUserProfileVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/profile"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserProfileVO](raw)
}

// 更新用户信息
func (a *UserApi) UpdateUserProfile(body sdktypes.UserProfileUpdateForm) (sdktypes.PlusApiResultUserProfileVO, error) {
    raw, err := a.client.Put(AppApiPath("/user/profile"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserProfileVO](raw)
}

// 修改密码
func (a *UserApi) ChangePassword(body sdktypes.PasswordChangeForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/user/password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取地址详情
func (a *UserApi) GetAddressDetail(addressId string) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 更新地址
func (a *UserApi) UpdateAddress(addressId string, body sdktypes.UserAddressUpdateForm) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 删除地址
func (a *UserApi) DeleteAddress(addressId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/user/address/%s", addressId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 设置默认地址
func (a *UserApi) SetDefaultAddress(addressId string) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/user/address/%s/default", addressId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 注销账号
func (a *UserApi) DeactivateAccount(body sdktypes.AccountDeactivateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/user/deactivate"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 绑定第三方账号
func (a *UserApi) BindThirdPartyAccount(platform string, body sdktypes.ThirdPartyBindForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/user/bind/%s", platform)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 解绑第三方账号
func (a *UserApi) UnbindThirdPartyAccount(platform string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/user/bind/%s", platform)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上传头像
func (a *UserApi) UploadAvatar(body *sdktypes.UploadAvatarRequest) (sdktypes.PlusApiResultMapStringString, error) {
    raw, err := a.client.Post(AppApiPath("/user/avatar"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringString](raw)
}

// 获取地址列表
func (a *UserApi) ListAddresses() (sdktypes.PlusApiResultListUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/address"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListUserAddressVO](raw)
}

// 创建地址
func (a *UserApi) CreateAddress(body sdktypes.UserAddressCreateForm) (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Post(AppApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}

// 获取登录历史
func (a *UserApi) GetLoginHistory(query map[string]interface{}) (sdktypes.PlusApiResultPageMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/user/history/login"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMapStringObject](raw)
}

// 获取生成历史
func (a *UserApi) GetGenerationHistory(query map[string]interface{}) (sdktypes.PlusApiResultPageMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/user/history/generations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMapStringObject](raw)
}

// 获取默认地址
func (a *UserApi) GetDefaultAddress() (sdktypes.PlusApiResultUserAddressVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/address/default"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserAddressVO](raw)
}
