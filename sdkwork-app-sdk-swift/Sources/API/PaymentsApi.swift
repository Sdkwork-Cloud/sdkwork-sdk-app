import Foundation

public class PaymentsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建支付
    public func createPayment(body: PaymentCreateForm) async throws -> PlusApiResultPaymentVO? {
        let response = try await client.post(ApiPaths.appPath("/payments"), body: body)
        return response as? PlusApiResultPaymentVO
    }

    /// 关闭支付
    public func closePayment(paymentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/payments/\(paymentId)/close"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 补单/对账
    public func reconcilePayment(body: PaymentReconcileForm) async throws -> PlusApiResultPaymentStatusVO? {
        let response = try await client.post(ApiPaths.appPath("/payments/reconcile"), body: body)
        return response as? PlusApiResultPaymentStatusVO
    }

    /// 通用支付回调
    public func paymentCallback(provider: String, body: PaymentCallbackRequest) async throws -> PaymentCallbackResponse? {
        let response = try await client.post(ApiPaths.appPath("/payments/callback/\(provider)"), body: body)
        return response as? PaymentCallbackResponse
    }

    /// 微信支付回调
    public func wechatPayCallback(body: String) async throws -> String? {
        let response = try await client.post(ApiPaths.appPath("/payments/callback/wechat"), body: body)
        return response as? String
    }

    /// 支付宝回调
    public func alipayCallback(params: [String: Any]? = nil) async throws -> String? {
        let response = try await client.post(ApiPaths.appPath("/payments/callback/alipay"), body: nil, params: params)
        return response as? String
    }

    /// 查询支付详情
    public func getPaymentDetail(paymentId: String) async throws -> PlusApiResultPaymentStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/\(paymentId)"))
        return response as? PlusApiResultPaymentStatusVO
    }

    /// 查询支付状态
    public func getPaymentStatus(paymentId: String) async throws -> PlusApiResultPaymentStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/\(paymentId)/status"))
        return response as? PlusApiResultPaymentStatusVO
    }

    /// 获取支付统计
    public func getPaymentStatistics() async throws -> PlusApiResultPaymentStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/statistics"))
        return response as? PlusApiResultPaymentStatisticsVO
    }

    /// 获取支付记录
    public func listPaymentRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPagePaymentStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/records"), params: params)
        return response as? PlusApiResultPagePaymentStatusVO
    }

    /// 根据商户订单号查询支付状态
    public func getPaymentStatusByOutTradeNo(outTradeNo: String) async throws -> PlusApiResultPaymentStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/outTradeNo/\(outTradeNo)/status"))
        return response as? PlusApiResultPaymentStatusVO
    }

    /// 获取订单的支付记录
    public func listOrder(orderId: String) async throws -> PlusApiResultListPaymentStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/order/\(orderId)"))
        return response as? PlusApiResultListPaymentStatusVO
    }

    /// 获取支付方式
    public func listPaymentMethods(params: [String: Any]? = nil) async throws -> PlusApiResultListPaymentMethodVO? {
        let response = try await client.get(ApiPaths.appPath("/payments/methods"), params: params)
        return response as? PlusApiResultListPaymentMethodVO
    }
}
