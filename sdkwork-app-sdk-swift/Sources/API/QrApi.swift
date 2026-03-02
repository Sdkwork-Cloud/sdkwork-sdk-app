import Foundation

public class QrApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
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

    /// 检查二维码状态
    public func checkQrCodeStatus(qrKey: String) async throws -> PlusApiResultQrCodeStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/auth/qr/status/\(qrKey)"))
        return response as? PlusApiResultQrCodeStatusVO
    }
}
