import Foundation

public class CurrencyApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建货币
    public func createCurrency(body: CurrencyCreateForm) async throws -> PlusApiResultCurrencyVO? {
        let response = try await client.post(ApiPaths.appPath("/currency"), body: body)
        return response as? PlusApiResultCurrencyVO
    }

    /// 禁用货币
    public func deactivate(currencyId: String) async throws -> PlusApiResultCurrencyVO? {
        let response = try await client.post(ApiPaths.appPath("/currency/\(currencyId)/deactivate"), body: nil)
        return response as? PlusApiResultCurrencyVO
    }

    /// 启用货币
    public func activate(currencyId: String) async throws -> PlusApiResultCurrencyVO? {
        let response = try await client.post(ApiPaths.appPath("/currency/\(currencyId)/activate"), body: nil)
        return response as? PlusApiResultCurrencyVO
    }

    /// 创建汇率
    public func createExchangeRate(body: ExchangeRateCreateForm) async throws -> PlusApiResultExchangeRateVO? {
        let response = try await client.post(ApiPaths.appPath("/currency/rate"), body: body)
        return response as? PlusApiResultExchangeRateVO
    }

    /// 货币兑换计算
    public func convert(body: CurrencyConvertForm) async throws -> PlusApiResultCurrencyConvertVO? {
        let response = try await client.post(ApiPaths.appPath("/currency/convert"), body: body)
        return response as? PlusApiResultCurrencyConvertVO
    }

    /// 获取货币详情
    public func getCurrency(currencyId: String) async throws -> PlusApiResultCurrencyVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/\(currencyId)"))
        return response as? PlusApiResultCurrencyVO
    }

    /// 获取货币类型列表
    public func getCurrencyTypes() async throws -> PlusApiResultListCurrencyTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/types"))
        return response as? PlusApiResultListCurrencyTypeVO
    }

    /// 获取最新汇率
    public func getLatestRate(params: [String: Any]? = nil) async throws -> PlusApiResultExchangeRateVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/rate/latest"), params: params)
        return response as? PlusApiResultExchangeRateVO
    }

    /// 获取汇率历史
    public func getRateHistory(params: [String: Any]? = nil) async throws -> PlusApiResultListExchangeRateVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/rate/history"), params: params)
        return response as? PlusApiResultListExchangeRateVO
    }

    /// 获取货币列表
    public func getCurrencyList(params: [String: Any]? = nil) async throws -> PlusApiResultPageCurrencyVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/list"), params: params)
        return response as? PlusApiResultPageCurrencyVO
    }

    /// 根据代码获取货币
    public func getCurrencyByCode(code: String) async throws -> PlusApiResultCurrencyVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/code/\(code)"))
        return response as? PlusApiResultCurrencyVO
    }

    /// 获取启用的货币
    public func getActiveCurrencies() async throws -> PlusApiResultListCurrencyVO? {
        let response = try await client.get(ApiPaths.appPath("/currency/active"))
        return response as? PlusApiResultListCurrencyVO
    }
}
