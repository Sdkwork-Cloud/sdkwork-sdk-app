import Foundation

public class InvoiceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取发票详情
    public func getInvoice(invoiceId: String) async throws -> PlusApiResultInvoiceDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/invoice/\(invoiceId)"))
        return response as? PlusApiResultInvoiceDetailVO
    }

    /// 更新发票
    public func updateInvoice(invoiceId: String, body: InvoiceUpdateForm) async throws -> PlusApiResultInvoiceVO? {
        let response = try await client.put(ApiPaths.appPath("/invoice/\(invoiceId)"), body: body)
        return response as? PlusApiResultInvoiceVO
    }

    /// 创建发票
    public func createInvoice(body: InvoiceCreateForm) async throws -> PlusApiResultInvoiceVO? {
        let response = try await client.post(ApiPaths.appPath("/invoice"), body: body)
        return response as? PlusApiResultInvoiceVO
    }

    /// 提交发票
    public func submit(invoiceId: String) async throws -> PlusApiResultInvoiceVO? {
        let response = try await client.post(ApiPaths.appPath("/invoice/\(invoiceId)/submit"), body: nil)
        return response as? PlusApiResultInvoiceVO
    }

    /// 作废发票
    public func cancel(invoiceId: String, body: InvoiceCancelForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/invoice/\(invoiceId)/cancel"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取发票明细
    public func getInvoiceItems(invoiceId: String) async throws -> PlusApiResultListInvoiceItemVO? {
        let response = try await client.get(ApiPaths.appPath("/invoice/\(invoiceId)/items"))
        return response as? PlusApiResultListInvoiceItemVO
    }

    /// 获取发票统计
    public func getInvoiceStatistics() async throws -> PlusApiResultInvoiceStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/invoice/statistics"))
        return response as? PlusApiResultInvoiceStatisticsVO
    }

    /// 搜索发票
    public func searchInvoices(params: [String: Any]? = nil) async throws -> PlusApiResultPageInvoiceVO? {
        let response = try await client.get(ApiPaths.appPath("/invoice/search"), params: params)
        return response as? PlusApiResultPageInvoiceVO
    }

    /// 获取我的发票
    public func getMyInvoices(params: [String: Any]? = nil) async throws -> PlusApiResultPageInvoiceVO? {
        let response = try await client.get(ApiPaths.appPath("/invoice/my"), params: params)
        return response as? PlusApiResultPageInvoiceVO
    }
}
