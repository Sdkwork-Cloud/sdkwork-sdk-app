import Foundation

public class OrdersApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取订单列表
    public func listOrders(params: [String: Any]? = nil) async throws -> PlusApiResultPageOrderVO? {
        let response = try await client.get(ApiPaths.appPath("/orders"), params: params)
        return response as? PlusApiResultPageOrderVO
    }

    /// 创建订单
    public func createOrder(body: OrderCreateForm) async throws -> PlusApiResultOrderVO? {
        let response = try await client.post(ApiPaths.appPath("/orders"), body: body)
        return response as? PlusApiResultOrderVO
    }

    /// 申请退款
    public func applyRefund(orderId: String, body: RefundApplyForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/orders/\(orderId)/refund"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 订单支付
    public func payOrder(orderId: String, body: OrderPayForm) async throws -> PlusApiResultPaymentParamsVO? {
        let response = try await client.post(ApiPaths.appPath("/orders/\(orderId)/pay"), body: body)
        return response as? PlusApiResultPaymentParamsVO
    }

    /// 确认收货
    public func confirmReceipt(orderId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/orders/\(orderId)/confirm"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消订单
    public func cancelOrder(orderId: String, body: OrderCancelForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/orders/\(orderId)/cancel"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取订单详情
    public func getOrderDetail(orderId: String) async throws -> PlusApiResultOrderDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/orders/\(orderId)"))
        return response as? PlusApiResultOrderDetailVO
    }

    /// 删除订单
    public func deleteOrder(orderId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/orders/\(orderId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取订单状态
    public func getOrderStatus(orderId: String) async throws -> PlusApiResultOrderStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/orders/\(orderId)/status"))
        return response as? PlusApiResultOrderStatusVO
    }

    /// 获取订单统计
    public func getOrderStatistics() async throws -> PlusApiResultOrderStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/orders/statistics"))
        return response as? PlusApiResultOrderStatisticsVO
    }
}
