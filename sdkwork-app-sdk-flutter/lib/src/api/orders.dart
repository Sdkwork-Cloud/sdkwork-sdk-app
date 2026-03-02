import '../http/client.dart';
import '../models.dart';

class OrdersApi {
  final HttpClient _client;
  
  OrdersApi(this._client);

  /// 获取订单列表
  Future<PlusApiResultPageOrderVO?> listOrders(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/orders'), params: params);
    return response is PlusApiResultPageOrderVO ? response : null;
  }

  /// 创建订单
  Future<PlusApiResultOrderVO?> createOrder(OrderCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/orders'), body: body, contentType: 'application/json');
    return response is PlusApiResultOrderVO ? response : null;
  }

  /// 申请退款
  Future<PlusApiResultVoid?> applyRefund(String orderId, RefundApplyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/orders/${orderId}/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 订单支付
  Future<PlusApiResultPaymentParamsVO?> payOrder(String orderId, OrderPayForm body) async {
    final response = await _client.post(ApiPaths.appPath('/orders/${orderId}/pay'), body: body, contentType: 'application/json');
    return response is PlusApiResultPaymentParamsVO ? response : null;
  }

  /// 确认收货
  Future<PlusApiResultVoid?> confirmReceipt(String orderId) async {
    final response = await _client.post(ApiPaths.appPath('/orders/${orderId}/confirm'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消订单
  Future<PlusApiResultVoid?> cancelOrder(String orderId, OrderCancelForm body) async {
    final response = await _client.post(ApiPaths.appPath('/orders/${orderId}/cancel'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取订单详情
  Future<PlusApiResultOrderDetailVO?> getOrderDetail(String orderId) async {
    final response = await _client.get(ApiPaths.appPath('/orders/${orderId}'));
    return response is PlusApiResultOrderDetailVO ? response : null;
  }

  /// 删除订单
  Future<PlusApiResultVoid?> deleteOrder(String orderId) async {
    final response = await _client.delete(ApiPaths.appPath('/orders/${orderId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取订单状态
  Future<PlusApiResultOrderStatusVO?> getOrderStatus(String orderId) async {
    final response = await _client.get(ApiPaths.appPath('/orders/${orderId}/status'));
    return response is PlusApiResultOrderStatusVO ? response : null;
  }

  /// 获取订单统计
  Future<PlusApiResultOrderStatisticsVO?> getOrderStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/orders/statistics'));
    return response is PlusApiResultOrderStatisticsVO ? response : null;
  }
}
