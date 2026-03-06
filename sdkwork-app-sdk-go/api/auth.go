package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AuthApi struct {
    client *sdkhttp.Client
}

func NewAuthApi(client *sdkhttp.Client) *AuthApi {
    return &AuthApi{client: client}
}

// 验证验证码
func (a *AuthApi) VerifySmsCode(body sdktypes.VerifyCodeCheckForm) (sdktypes.PlusApiResultVerifyResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/sms/verify"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerifyResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerifyResultVO](raw)
}

// 发送验证码
func (a *AuthApi) SendSmsCode(body sdktypes.VerifyCodeSendForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/sms/send"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 用户注册
func (a *AuthApi) Register(body sdktypes.RegisterForm) (sdktypes.PlusApiResultUserInfoVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/register"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserInfoVO](raw)
}

// 刷新令牌
func (a *AuthApi) RefreshToken(body sdktypes.TokenRefreshForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/refresh"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}

// 生成登录二维码
func (a *AuthApi) GenerateQrCode() (sdktypes.PlusApiResultQrCodeVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/qr/generate"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeVO](raw)
}

// 确认二维码登录
func (a *AuthApi) ConfirmQrCodeLogin(body sdktypes.QrCodeConfirmForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/qr/confirm"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 手机号验证码登录
func (a *AuthApi) PhoneLogin(body sdktypes.PhoneLoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/phone/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}

// 重置密码
func (a *AuthApi) ResetPassword(body sdktypes.PasswordResetForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/password/reset"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Request password reset challenge
func (a *AuthApi) RequestPasswordResetChallenge(body sdktypes.PasswordResetRequestForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/password/reset/request"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// OAuth授权URL
func (a *AuthApi) GetOauthUrl(body sdktypes.OAuthAuthUrlForm) (sdktypes.PlusApiResultOAuthUrlVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/oauth/url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOAuthUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOAuthUrlVO](raw)
}

// OAuth登录
func (a *AuthApi) OauthLogin(body sdktypes.OAuthLoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/oauth/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}

// 用户登出
func (a *AuthApi) Logout() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/logout"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 用户登录
func (a *AuthApi) Login(body sdktypes.LoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}

// 检查二维码状态
func (a *AuthApi) CheckQrCodeStatus(qrKey string) (sdktypes.PlusApiResultQrCodeStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/auth/qr/status/%s", qrKey)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeStatusVO](raw)
}

// 二维码统一入口
func (a *AuthApi) QrCodeEntry(qrKey string) (struct{}, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/auth/qr/entry/%s", qrKey)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
