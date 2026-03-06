package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AuthApi(private val client: HttpClient) {

    /** 验证验证码 */
    suspend fun verifySmsCode(body: VerifyCodeCheckForm): PlusApiResultVerifyResultVO? {
        return client.post(ApiPaths.appPath("/auth/sms/verify"), body) as? PlusApiResultVerifyResultVO
    }

    /** 发送验证码 */
    suspend fun sendSmsCode(body: VerifyCodeSendForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/sms/send"), body) as? PlusApiResultVoid
    }

    /** 用户注册 */
    suspend fun register(body: RegisterForm): PlusApiResultUserInfoVO? {
        return client.post(ApiPaths.appPath("/auth/register"), body) as? PlusApiResultUserInfoVO
    }

    /** 刷新令牌 */
    suspend fun refreshToken(body: TokenRefreshForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/refresh"), body) as? PlusApiResultLoginVO
    }

    /** 生成登录二维码 */
    suspend fun generateQrCode(): PlusApiResultQrCodeVO? {
        return client.post(ApiPaths.appPath("/auth/qr/generate"), null) as? PlusApiResultQrCodeVO
    }

    /** 确认二维码登录 */
    suspend fun confirmQrCodeLogin(body: QrCodeConfirmForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/qr/confirm"), body) as? PlusApiResultVoid
    }

    /** 手机号验证码登录 */
    suspend fun phoneLogin(body: PhoneLoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/phone/login"), body) as? PlusApiResultLoginVO
    }

    /** 重置密码 */
    suspend fun resetPassword(body: PasswordResetForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/password/reset"), body) as? PlusApiResultVoid
    }

    /** Request password reset challenge */
    suspend fun requestPasswordResetChallenge(body: PasswordResetRequestForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/password/reset/request"), body) as? PlusApiResultVoid
    }

    /** OAuth授权URL */
    suspend fun getOauthUrl(body: OAuthAuthUrlForm): PlusApiResultOAuthUrlVO? {
        return client.post(ApiPaths.appPath("/auth/oauth/url"), body) as? PlusApiResultOAuthUrlVO
    }

    /** OAuth登录 */
    suspend fun oauthLogin(body: OAuthLoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/oauth/login"), body) as? PlusApiResultLoginVO
    }

    /** 用户登出 */
    suspend fun logout(): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/logout"), null) as? PlusApiResultVoid
    }

    /** 用户登录 */
    suspend fun login(body: LoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/login"), body) as? PlusApiResultLoginVO
    }

    /** 检查二维码状态 */
    suspend fun checkQrCodeStatus(qrKey: String): PlusApiResultQrCodeStatusVO? {
        return client.get(ApiPaths.appPath("/auth/qr/status/$qrKey")) as? PlusApiResultQrCodeStatusVO
    }

    /** 二维码统一入口 */
    suspend fun qrCodeEntry(qrKey: String): Unit {
        client.get(ApiPaths.appPath("/auth/qr/entry/$qrKey"))
    }
}
