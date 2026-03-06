import '../http/client.dart';
import '../models.dart';

class WalletApi {
  final HttpClient _client;
  
  WalletApi(this._client);

  /// 钱包提现
  Future<PlusApiResultWalletOperationResultVO?> withdraw(WalletWithdrawalForm body) async {
    final response = await _client.post(ApiPaths.appPath('/wallet/withdrawals'), body: body, contentType: 'application/json');
    return response is PlusApiResultWalletOperationResultVO ? response : null;
  }

  /// 钱包转账
  Future<PlusApiResultWalletOperationResultVO?> transfer(WalletTransferForm body) async {
    final response = await _client.post(ApiPaths.appPath('/wallet/transfers'), body: body, contentType: 'application/json');
    return response is PlusApiResultWalletOperationResultVO ? response : null;
  }

  /// 钱包充值
  Future<PlusApiResultWalletOperationResultVO?> topup(WalletTopupForm body) async {
    final response = await _client.post(ApiPaths.appPath('/wallet/topups'), body: body, contentType: 'application/json');
    return response is PlusApiResultWalletOperationResultVO ? response : null;
  }

  /// 钱包兑换
  Future<PlusApiResultWalletOperationResultVO?> exchange(WalletExchangeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/wallet/exchanges'), body: body, contentType: 'application/json');
    return response is PlusApiResultWalletOperationResultVO ? response : null;
  }

  /// 钱包总览
  Future<PlusApiResultWalletOverviewVO?> getOverview() async {
    final response = await _client.get(ApiPaths.appPath('/wallet'));
    return response is PlusApiResultWalletOverviewVO ? response : null;
  }

  /// 钱包流水分页
  Future<PlusApiResultPageHistoryVO?> listTransactions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/wallet/transactions'), params: params);
    return response is PlusApiResultPageHistoryVO ? response : null;
  }

  /// 交易详情
  Future<PlusApiResultHistoryVO?> getTransaction(String transactionId) async {
    final response = await _client.get(ApiPaths.appPath('/wallet/transactions/${transactionId}'));
    return response is PlusApiResultHistoryVO ? response : null;
  }

  /// 按请求号查询操作状态
  Future<PlusApiResultWalletOperationStatusVO?> getOperationStatus(String requestNo, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/wallet/operations/${requestNo}'), params: params);
    return response is PlusApiResultWalletOperationStatusVO ? response : null;
  }

  /// 资产账户列表
  Future<PlusApiResultListWalletAssetAccountVO?> listAccounts() async {
    final response = await _client.get(ApiPaths.appPath('/wallet/accounts'));
    return response is PlusApiResultListWalletAssetAccountVO ? response : null;
  }
}
