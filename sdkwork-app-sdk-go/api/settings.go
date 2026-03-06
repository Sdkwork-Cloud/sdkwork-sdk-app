package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SettingsApi struct {
    client *sdkhttp.Client
}

func NewSettingsApi(client *sdkhttp.Client) *SettingsApi {
    return &SettingsApi{client: client}
}

// 获取模块设置
func (a *SettingsApi) GetModule(module string) (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/settings/%s", module)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// 更新模块设置
func (a *SettingsApi) UpdateModule(module string, body sdktypes.SettingsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/settings/%s", module)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 重置模块设置
func (a *SettingsApi) ResetModule(module string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/settings/%s", module)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取界面设置
func (a *SettingsApi) GetUi() (sdktypes.PlusApiResultUISettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/settings/ui"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUISettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUISettingsVO](raw)
}

// 更新界面设置
func (a *SettingsApi) UpdateUi(body sdktypes.UISettingsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/ui"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 切换主题
func (a *SettingsApi) SwitchTheme(body sdktypes.ThemeSwitchForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/ui/theme"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 切换语言
func (a *SettingsApi) SwitchLanguage(body sdktypes.LanguageSwitchForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/ui/language"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取安全设置
func (a *SettingsApi) GetSecurity() (sdktypes.PlusApiResultSecuritySettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/settings/security"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSecuritySettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSecuritySettingsVO](raw)
}

// 更新安全设置
func (a *SettingsApi) UpdateSecurity(body sdktypes.SecuritySettingsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/security"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 修改密码
func (a *SettingsApi) ChangePassword(body sdktypes.PasswordChangeForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/security/password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 两步验证设置
func (a *SettingsApi) ToggleTwoFactor(body sdktypes.TwoFactorToggleForm) (sdktypes.PlusApiResultTwoFactorSetupVO, error) {
    raw, err := a.client.Put(AppApiPath("/settings/security/2fa"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTwoFactorSetupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTwoFactorSetupVO](raw)
}

// 获取隐私设置
func (a *SettingsApi) GetPrivacy() (sdktypes.PlusApiResultPrivacySettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/settings/privacy"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPrivacySettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPrivacySettingsVO](raw)
}

// 更新隐私设置
func (a *SettingsApi) UpdatePrivacy(body sdktypes.PrivacySettingsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/settings/privacy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 导出用户数据
func (a *SettingsApi) ExportUserData(body sdktypes.DataExportForm) (sdktypes.PlusApiResultDataExportVO, error) {
    raw, err := a.client.Post(AppApiPath("/settings/data/export"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDataExportVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDataExportVO](raw)
}

// 获取所有设置
func (a *SettingsApi) GetAll() (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// 重置所有设置
func (a *SettingsApi) ResetAll() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取版本信息
func (a *SettingsApi) GetAppVersion(query map[string]interface{}) (sdktypes.PlusApiResultAppVersionVO, error) {
    raw, err := a.client.Get(AppApiPath("/settings/app/version"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppVersionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppVersionVO](raw)
}

// 获取功能开关
func (a *SettingsApi) GetFeatureFlags() (sdktypes.PlusApiResultMapStringBoolean, error) {
    raw, err := a.client.Get(AppApiPath("/settings/app/features"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringBoolean](raw)
}

// 获取应用配置
func (a *SettingsApi) GetAppConfig() (sdktypes.PlusApiResultAppConfigVO, error) {
    raw, err := a.client.Get(AppApiPath("/settings/app/config"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppConfigVO](raw)
}

// 清除本地数据
func (a *SettingsApi) ClearLocalData() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/settings/data/local"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 清除缓存
func (a *SettingsApi) ClearCache() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/settings/cache"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 删除账户
func (a *SettingsApi) DeleteAccount() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/settings/account"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
