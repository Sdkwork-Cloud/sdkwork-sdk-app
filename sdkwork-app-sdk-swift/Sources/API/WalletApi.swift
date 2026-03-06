import Foundation

public class WalletApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 钱包提现
    public func withdraw(body: WalletWithdrawalForm) async throws -> PlusApiResultWalletOperationResultVO? {
        let response = try await client.post(ApiPaths.appPath("/wallet/withdrawals"), body: body)
        return response as? PlusApiResultWalletOperationResultVO
    }

    /// 钱包转账
    public func transfer(body: WalletTransferForm) async throws -> PlusApiResultWalletOperationResultVO? {
        let response = try await client.post(ApiPaths.appPath("/wallet/transfers"), body: body)
        return response as? PlusApiResultWalletOperationResultVO
    }

    /// 钱包充值
    public func topup(body: WalletTopupForm) async throws -> PlusApiResultWalletOperationResultVO? {
        let response = try await client.post(ApiPaths.appPath("/wallet/topups"), body: body)
        return response as? PlusApiResultWalletOperationResultVO
    }

    /// 钱包兑换
    public func exchange(body: WalletExchangeForm) async throws -> PlusApiResultWalletOperationResultVO? {
        let response = try await client.post(ApiPaths.appPath("/wallet/exchanges"), body: body)
        return response as? PlusApiResultWalletOperationResultVO
    }

    /// 钱包总览
    public func getOverview() async throws -> PlusApiResultWalletOverviewVO? {
        let response = try await client.get(ApiPaths.appPath("/wallet"))
        return response as? PlusApiResultWalletOverviewVO
    }

    /// 钱包流水分页
    public func listTransactions(params: [String: Any]? = nil) async throws -> PlusApiResultPageHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/wallet/transactions"), params: params)
        return response as? PlusApiResultPageHistoryVO
    }

    /// 交易详情
    public func getTransaction(transactionId: String) async throws -> PlusApiResultHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/wallet/transactions/\(transactionId)"))
        return response as? PlusApiResultHistoryVO
    }

    /// 按请求号查询操作状态
    public func getOperationStatus(requestNo: String, params: [String: Any]? = nil) async throws -> PlusApiResultWalletOperationStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/wallet/operations/\(requestNo)"), params: params)
        return response as? PlusApiResultWalletOperationStatusVO
    }

    /// 资产账户列表
    public func listAccounts() async throws -> PlusApiResultListWalletAssetAccountVO? {
        let response = try await client.get(ApiPaths.appPath("/wallet/accounts"))
        return response as? PlusApiResultListWalletAssetAccountVO
    }
}
