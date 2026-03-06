import Foundation

public class AuthApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 验证验证码
    public func verifySmsCode(body: VerifyCodeCheckForm) async throws -> PlusApiResultVerifyResultVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/sms/verify"), body: body)
        return response as? PlusApiResultVerifyResultVO
    }

    /// 发送验证码
    public func sendSmsCode(body: VerifyCodeSendForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/sms/send"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 用户注册
    public func register(body: RegisterForm) async throws -> PlusApiResultUserInfoVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/register"), body: body)
        return response as? PlusApiResultUserInfoVO
    }

    /// 刷新令牌
    public func refreshToken(body: TokenRefreshForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/refresh"), body: body)
        return response as? PlusApiResultLoginVO
    }

    /// 生成登录二维码
    public func generateQrCode() async throws -> PlusApiResultQrCodeVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/qr/generate"), body: nil)
        return response as? PlusApiResultQrCodeVO
    }

    /// 确认二维码登录
    public func confirmQrCodeLogin(body: QrCodeConfirmForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/qr/confirm"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 手机号验证码登录
    public func phoneLogin(body: PhoneLoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/phone/login"), body: body)
        return response as? PlusApiResultLoginVO
    }

    /// 重置密码
    public func resetPassword(body: PasswordResetForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/password/reset"), body: body)
        return response as? PlusApiResultVoid
    }

    /// Request password reset challenge
    public func requestPasswordResetChallenge(body: PasswordResetRequestForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/password/reset/request"), body: body)
        return response as? PlusApiResultVoid
    }

    /// OAuth授权URL
    public func getOauthUrl(body: OAuthAuthUrlForm) async throws -> PlusApiResultOAuthUrlVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/oauth/url"), body: body)
        return response as? PlusApiResultOAuthUrlVO
    }

    /// OAuth登录
    public func oauthLogin(body: OAuthLoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/oauth/login"), body: body)
        return response as? PlusApiResultLoginVO
    }

    /// 用户登出
    public func logout() async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/logout"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 用户登录
    public func login(body: LoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/login"), body: body)
        return response as? PlusApiResultLoginVO
    }

    /// 检查二维码状态
    public func checkQrCodeStatus(qrKey: String) async throws -> PlusApiResultQrCodeStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/auth/qr/status/\(qrKey)"))
        return response as? PlusApiResultQrCodeStatusVO
    }

    /// 二维码统一入口
    public func qrCodeEntry(qrKey: String) async throws -> Void {
        _ = try await client.get(ApiPaths.appPath("/auth/qr/entry/\(qrKey)"))
    }
}
