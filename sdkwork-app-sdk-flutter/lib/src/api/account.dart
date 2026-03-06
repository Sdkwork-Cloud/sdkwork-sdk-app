import '../http/client.dart';
import '../models.dart';

class AccountApi {
  final HttpClient _client;
  
  AccountApi(this._client);

  /// 积分转账
  Future<PlusApiResultPointsTransferVO?> transfer(PointsTransferForm body) async {
    final response = await _client.post(ApiPaths.appPath('/account/points/transfer'), body: body, contentType: 'application/json');
    return response is PlusApiResultPointsTransferVO ? response : null;
  }

  /// 扣除Token
  Future<PlusApiResultPointsAccountInfoVO?> deductToken(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/account/points/token/deduct'), params: params);
    return response is PlusApiResultPointsAccountInfoVO ? response : null;
  }

  /// 积分兑换
  Future<PlusApiResultPointsExchangeVO?> exchange(PointsExchangeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/account/points/exchange'), body: body, contentType: 'application/json');
    return response is PlusApiResultPointsExchangeVO ? response : null;
  }

  /// 提现
  Future<PlusApiResultCashWithdrawVO?> withdraw(CashWithdrawForm body) async {
    final response = await _client.post(ApiPaths.appPath('/account/cash/withdraw'), body: body, contentType: 'application/json');
    return response is PlusApiResultCashWithdrawVO ? response : null;
  }

  /// 转账
  Future<PlusApiResultCashTransferVO?> createTransfer(CashTransferForm body) async {
    final response = await _client.post(ApiPaths.appPath('/account/cash/transfer'), body: body, contentType: 'application/json');
    return response is PlusApiResultCashTransferVO ? response : null;
  }

  /// 充值
  Future<PlusApiResultCashRechargeVO?> recharge(CashRechargeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/account/cash/recharge'), body: body, contentType: 'application/json');
    return response is PlusApiResultCashRechargeVO ? response : null;
  }

  /// 获取积分账户信息
  Future<PlusApiResultPointsAccountInfoVO?> getPoints() async {
    final response = await _client.get(ApiPaths.appPath('/account/points'));
    return response is PlusApiResultPointsAccountInfoVO ? response : null;
  }

  /// 获取Token账户信息
  Future<PlusApiResultPointsAccountInfoVO?> getToken() async {
    final response = await _client.get(ApiPaths.appPath('/account/points/token'));
    return response is PlusApiResultPointsAccountInfoVO ? response : null;
  }

  /// 获取交易历史
  Future<PlusApiResultPageHistoryVO?> getHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/account/points/history'), params: params);
    return response is PlusApiResultPageHistoryVO ? response : null;
  }

  /// 获取积分兑换现金比例
  Future<PlusApiResultBigDecimal?> getPointsToCashRate() async {
    final response = await _client.get(ApiPaths.appPath('/account/points/exchange-rate'));
    return response is PlusApiResultBigDecimal ? response : null;
  }

  /// 获取现金账户信息
  Future<PlusApiResultCashAccountInfoVO?> getCash() async {
    final response = await _client.get(ApiPaths.appPath('/account/cash'));
    return response is PlusApiResultCashAccountInfoVO ? response : null;
  }

  /// 获取交易历史
  Future<PlusApiResultPageHistoryVO?> getHistoryCash(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/account/cash/history'), params: params);
    return response is PlusApiResultPageHistoryVO ? response : null;
  }
}
