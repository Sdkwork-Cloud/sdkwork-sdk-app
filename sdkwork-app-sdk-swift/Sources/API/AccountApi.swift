import Foundation

public class AccountApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 积分转账
    public func transfer(body: PointsTransferForm) async throws -> PlusApiResultPointsTransferVO? {
        let response = try await client.post(ApiPaths.appPath("/account/points/transfer"), body: body)
        return response as? PlusApiResultPointsTransferVO
    }

    /// 扣除Token
    public func deductToken(params: [String: Any]? = nil) async throws -> PlusApiResultPointsAccountInfoVO? {
        let response = try await client.post(ApiPaths.appPath("/account/points/token/deduct"), body: nil, params: params)
        return response as? PlusApiResultPointsAccountInfoVO
    }

    /// 积分兑换
    public func exchange(body: PointsExchangeForm) async throws -> PlusApiResultPointsExchangeVO? {
        let response = try await client.post(ApiPaths.appPath("/account/points/exchange"), body: body)
        return response as? PlusApiResultPointsExchangeVO
    }

    /// 提现
    public func withdraw(body: CashWithdrawForm) async throws -> PlusApiResultCashWithdrawVO? {
        let response = try await client.post(ApiPaths.appPath("/account/cash/withdraw"), body: body)
        return response as? PlusApiResultCashWithdrawVO
    }

    /// 转账
    public func createTransfer(body: CashTransferForm) async throws -> PlusApiResultCashTransferVO? {
        let response = try await client.post(ApiPaths.appPath("/account/cash/transfer"), body: body)
        return response as? PlusApiResultCashTransferVO
    }

    /// 充值
    public func recharge(body: CashRechargeForm) async throws -> PlusApiResultCashRechargeVO? {
        let response = try await client.post(ApiPaths.appPath("/account/cash/recharge"), body: body)
        return response as? PlusApiResultCashRechargeVO
    }

    /// 获取积分账户信息
    public func getPoints() async throws -> PlusApiResultPointsAccountInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/account/points"))
        return response as? PlusApiResultPointsAccountInfoVO
    }

    /// 获取Token账户信息
    public func getToken() async throws -> PlusApiResultPointsAccountInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/account/points/token"))
        return response as? PlusApiResultPointsAccountInfoVO
    }

    /// 获取交易历史
    public func getHistory(params: [String: Any]? = nil) async throws -> PlusApiResultPageHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/account/points/history"), params: params)
        return response as? PlusApiResultPageHistoryVO
    }

    /// 获取现金账户信息
    public func getCash() async throws -> PlusApiResultCashAccountInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/account/cash"))
        return response as? PlusApiResultCashAccountInfoVO
    }

    /// 获取交易历史
    public func getHistoryCash(params: [String: Any]? = nil) async throws -> PlusApiResultPageHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/account/cash/history"), params: params)
        return response as? PlusApiResultPageHistoryVO
    }
}
