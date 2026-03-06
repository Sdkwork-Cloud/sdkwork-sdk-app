package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AuthApi {
    private final HttpClient client;
    
    public AuthApi(HttpClient client) {
        this.client = client;
    }

    /** 验证验证码 */
    public PlusApiResultVerifyResultVO verifySmsCode(VerifyCodeCheckForm body) throws Exception {
        return (PlusApiResultVerifyResultVO) client.post(ApiPaths.appPath("/auth/sms/verify"), body);
    }

    /** 发送验证码 */
    public PlusApiResultVoid sendSmsCode(VerifyCodeSendForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/sms/send"), body);
    }

    /** 用户注册 */
    public PlusApiResultUserInfoVO register(RegisterForm body) throws Exception {
        return (PlusApiResultUserInfoVO) client.post(ApiPaths.appPath("/auth/register"), body);
    }

    /** 刷新令牌 */
    public PlusApiResultLoginVO refreshToken(TokenRefreshForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/refresh"), body);
    }

    /** 生成登录二维码 */
    public PlusApiResultQrCodeVO generateQrCode() throws Exception {
        return (PlusApiResultQrCodeVO) client.post(ApiPaths.appPath("/auth/qr/generate"), null);
    }

    /** 确认二维码登录 */
    public PlusApiResultVoid confirmQrCodeLogin(QrCodeConfirmForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/qr/confirm"), body);
    }

    /** 手机号验证码登录 */
    public PlusApiResultLoginVO phoneLogin(PhoneLoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/phone/login"), body);
    }

    /** 重置密码 */
    public PlusApiResultVoid resetPassword(PasswordResetForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/password/reset"), body);
    }

    /** Request password reset challenge */
    public PlusApiResultVoid requestPasswordResetChallenge(PasswordResetRequestForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/password/reset/request"), body);
    }

    /** OAuth授权URL */
    public PlusApiResultOAuthUrlVO getOauthUrl(OAuthAuthUrlForm body) throws Exception {
        return (PlusApiResultOAuthUrlVO) client.post(ApiPaths.appPath("/auth/oauth/url"), body);
    }

    /** OAuth登录 */
    public PlusApiResultLoginVO oauthLogin(OAuthLoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/oauth/login"), body);
    }

    /** 用户登出 */
    public PlusApiResultVoid logout() throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/logout"), null);
    }

    /** 用户登录 */
    public PlusApiResultLoginVO login(LoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/login"), body);
    }

    /** 检查二维码状态 */
    public PlusApiResultQrCodeStatusVO checkQrCodeStatus(String qrKey) throws Exception {
        return (PlusApiResultQrCodeStatusVO) client.get(ApiPaths.appPath("/auth/qr/status/" + qrKey + ""));
    }

    /** 二维码统一入口 */
    public Void qrCodeEntry(String qrKey) throws Exception {
        client.get(ApiPaths.appPath("/auth/qr/entry/" + qrKey + ""));
        return null;
    }
}
