import '../http/client.dart';
import '../models.dart';

class PaymentsApi {
  final HttpClient _client;
  
  PaymentsApi(this._client);

  /// 创建支付
  Future<PlusApiResultPaymentVO?> createPayment(PaymentCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/payments'), body: body, contentType: 'application/json');
    return response is PlusApiResultPaymentVO ? response : null;
  }

  /// 关闭支付
  Future<PlusApiResultVoid?> closePayment(String paymentId) async {
    final response = await _client.post(ApiPaths.appPath('/payments/${paymentId}/close'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 补单/对账
  Future<PlusApiResultPaymentStatusVO?> reconcilePayment(PaymentReconcileForm body) async {
    final response = await _client.post(ApiPaths.appPath('/payments/reconcile'), body: body, contentType: 'application/json');
    return response is PlusApiResultPaymentStatusVO ? response : null;
  }

  /// 通用支付回调
  Future<PaymentCallbackResponse?> paymentCallback(String provider, PaymentCallbackRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/payments/callback/${provider}'), body: body, contentType: 'application/json');
    return response is PaymentCallbackResponse ? response : null;
  }

  /// 微信支付回调
  Future<String?> wechatPayCallback(String body) async {
    final response = await _client.post(ApiPaths.appPath('/payments/callback/wechat'), body: body, contentType: 'application/json');
    return response is String ? response : null;
  }

  /// 支付宝回调
  Future<String?> alipayCallback(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/payments/callback/alipay'), params: params);
    return response is String ? response : null;
  }

  /// 查询支付详情
  Future<PlusApiResultPaymentStatusVO?> getPaymentDetail(String paymentId) async {
    final response = await _client.get(ApiPaths.appPath('/payments/${paymentId}'));
    return response is PlusApiResultPaymentStatusVO ? response : null;
  }

  /// 查询支付状态
  Future<PlusApiResultPaymentStatusVO?> getPaymentStatus(String paymentId) async {
    final response = await _client.get(ApiPaths.appPath('/payments/${paymentId}/status'));
    return response is PlusApiResultPaymentStatusVO ? response : null;
  }

  /// 获取支付统计
  Future<PlusApiResultPaymentStatisticsVO?> getPaymentStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/payments/statistics'));
    return response is PlusApiResultPaymentStatisticsVO ? response : null;
  }

  /// 获取支付记录
  Future<PlusApiResultPagePaymentStatusVO?> listPaymentRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/payments/records'), params: params);
    return response is PlusApiResultPagePaymentStatusVO ? response : null;
  }

  /// 根据商户订单号查询支付状态
  Future<PlusApiResultPaymentStatusVO?> getPaymentStatusByOutTradeNo(String outTradeNo) async {
    final response = await _client.get(ApiPaths.appPath('/payments/outTradeNo/${outTradeNo}/status'));
    return response is PlusApiResultPaymentStatusVO ? response : null;
  }

  /// 获取订单的支付记录
  Future<PlusApiResultListPaymentStatusVO?> listOrder(String orderId) async {
    final response = await _client.get(ApiPaths.appPath('/payments/order/${orderId}'));
    return response is PlusApiResultListPaymentStatusVO ? response : null;
  }

  /// 获取支付方式
  Future<PlusApiResultListPaymentMethodVO?> listPaymentMethods(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/payments/methods'), params: params);
    return response is PlusApiResultListPaymentMethodVO ? response : null;
  }
}
