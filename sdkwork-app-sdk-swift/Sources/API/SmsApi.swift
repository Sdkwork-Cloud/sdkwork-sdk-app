import Foundation

public class SmsApi {
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
}
