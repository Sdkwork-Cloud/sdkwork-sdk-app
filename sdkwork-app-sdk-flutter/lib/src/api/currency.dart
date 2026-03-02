import '../http/client.dart';
import '../models.dart';

class CurrencyApi {
  final HttpClient _client;
  
  CurrencyApi(this._client);

  /// 创建货币
  Future<PlusApiResultCurrencyVO?> createCurrency(CurrencyCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/currency'), body: body, contentType: 'application/json');
    return response is PlusApiResultCurrencyVO ? response : null;
  }

  /// 禁用货币
  Future<PlusApiResultCurrencyVO?> deactivate(String currencyId) async {
    final response = await _client.post(ApiPaths.appPath('/currency/${currencyId}/deactivate'));
    return response is PlusApiResultCurrencyVO ? response : null;
  }

  /// 启用货币
  Future<PlusApiResultCurrencyVO?> activate(String currencyId) async {
    final response = await _client.post(ApiPaths.appPath('/currency/${currencyId}/activate'));
    return response is PlusApiResultCurrencyVO ? response : null;
  }

  /// 创建汇率
  Future<PlusApiResultExchangeRateVO?> createExchangeRate(ExchangeRateCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/currency/rate'), body: body, contentType: 'application/json');
    return response is PlusApiResultExchangeRateVO ? response : null;
  }

  /// 货币兑换计算
  Future<PlusApiResultCurrencyConvertVO?> convert(CurrencyConvertForm body) async {
    final response = await _client.post(ApiPaths.appPath('/currency/convert'), body: body, contentType: 'application/json');
    return response is PlusApiResultCurrencyConvertVO ? response : null;
  }

  /// 获取货币详情
  Future<PlusApiResultCurrencyVO?> getCurrency(String currencyId) async {
    final response = await _client.get(ApiPaths.appPath('/currency/${currencyId}'));
    return response is PlusApiResultCurrencyVO ? response : null;
  }

  /// 获取货币类型列表
  Future<PlusApiResultListCurrencyTypeVO?> getCurrencyTypes() async {
    final response = await _client.get(ApiPaths.appPath('/currency/types'));
    return response is PlusApiResultListCurrencyTypeVO ? response : null;
  }

  /// 获取最新汇率
  Future<PlusApiResultExchangeRateVO?> getLatestRate(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/currency/rate/latest'), params: params);
    return response is PlusApiResultExchangeRateVO ? response : null;
  }

  /// 获取汇率历史
  Future<PlusApiResultListExchangeRateVO?> getRateHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/currency/rate/history'), params: params);
    return response is PlusApiResultListExchangeRateVO ? response : null;
  }

  /// 获取货币列表
  Future<PlusApiResultPageCurrencyVO?> getCurrencyList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/currency/list'), params: params);
    return response is PlusApiResultPageCurrencyVO ? response : null;
  }

  /// 根据代码获取货币
  Future<PlusApiResultCurrencyVO?> getCurrencyByCode(String code) async {
    final response = await _client.get(ApiPaths.appPath('/currency/code/${code}'));
    return response is PlusApiResultCurrencyVO ? response : null;
  }

  /// 获取启用的货币
  Future<PlusApiResultListCurrencyVO?> getActiveCurrencies() async {
    final response = await _client.get(ApiPaths.appPath('/currency/active'));
    return response is PlusApiResultListCurrencyVO ? response : null;
  }
}
