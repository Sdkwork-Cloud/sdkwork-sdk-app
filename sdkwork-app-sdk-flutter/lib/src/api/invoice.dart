import '../http/client.dart';
import '../models.dart';

class InvoiceApi {
  final HttpClient _client;
  
  InvoiceApi(this._client);

  /// 获取发票详情
  Future<PlusApiResultInvoiceDetailVO?> getInvoice(String invoiceId) async {
    final response = await _client.get(ApiPaths.appPath('/invoice/${invoiceId}'));
    return response is PlusApiResultInvoiceDetailVO ? response : null;
  }

  /// 更新发票
  Future<PlusApiResultInvoiceVO?> updateInvoice(String invoiceId, InvoiceUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/invoice/${invoiceId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvoiceVO ? response : null;
  }

  /// 创建发票
  Future<PlusApiResultInvoiceVO?> createInvoice(InvoiceCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/invoice'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvoiceVO ? response : null;
  }

  /// 提交发票
  Future<PlusApiResultInvoiceVO?> submit(String invoiceId) async {
    final response = await _client.post(ApiPaths.appPath('/invoice/${invoiceId}/submit'));
    return response is PlusApiResultInvoiceVO ? response : null;
  }

  /// 作废发票
  Future<PlusApiResultVoid?> cancel(String invoiceId, InvoiceCancelForm body) async {
    final response = await _client.post(ApiPaths.appPath('/invoice/${invoiceId}/cancel'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取发票明细
  Future<PlusApiResultListInvoiceItemVO?> getInvoiceItems(String invoiceId) async {
    final response = await _client.get(ApiPaths.appPath('/invoice/${invoiceId}/items'));
    return response is PlusApiResultListInvoiceItemVO ? response : null;
  }

  /// 获取发票统计
  Future<PlusApiResultInvoiceStatisticsVO?> getInvoiceStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/invoice/statistics'));
    return response is PlusApiResultInvoiceStatisticsVO ? response : null;
  }

  /// 搜索发票
  Future<PlusApiResultPageInvoiceVO?> searchInvoices(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/invoice/search'), params: params);
    return response is PlusApiResultPageInvoiceVO ? response : null;
  }

  /// 获取我的发票
  Future<PlusApiResultPageInvoiceVO?> getMyInvoices(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/invoice/my'), params: params);
    return response is PlusApiResultPageInvoiceVO ? response : null;
  }
}
