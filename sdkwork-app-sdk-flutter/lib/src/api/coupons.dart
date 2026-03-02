import '../http/client.dart';
import '../models.dart';

class CouponsApi {
  final HttpClient _client;
  
  CouponsApi(this._client);

  /// 领取优惠券
  Future<PlusApiResultUserCouponVO?> receiveCoupon(String couponId) async {
    final response = await _client.post(ApiPaths.appPath('/coupons/${couponId}/receive'));
    return response is PlusApiResultUserCouponVO ? response : null;
  }

  /// 使用优惠券
  Future<PlusApiResultUserCouponVO?> useCoupon(String userCouponId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/coupons/my/${userCouponId}/use'), params: params);
    return response is PlusApiResultUserCouponVO ? response : null;
  }

  /// 取消使用优惠券
  Future<PlusApiResultUserCouponVO?> cancelUseCoupon(String userCouponId) async {
    final response = await _client.post(ApiPaths.appPath('/coupons/my/${userCouponId}/cancel'));
    return response is PlusApiResultUserCouponVO ? response : null;
  }

  /// 获取可领取优惠券列表
  Future<PlusApiResultPageCouponVO?> listCoupons(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/coupons'), params: params);
    return response is PlusApiResultPageCouponVO ? response : null;
  }

  /// 获取优惠券详情
  Future<PlusApiResultCouponVO?> getCouponDetail(String couponId) async {
    final response = await _client.get(ApiPaths.appPath('/coupons/${couponId}'));
    return response is PlusApiResultCouponVO ? response : null;
  }

  /// 获取优惠券统计
  Future<PlusApiResultCouponStatisticsVO?> getStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/coupons/statistics'));
    return response is PlusApiResultCouponStatisticsVO ? response : null;
  }

  /// 获取我的优惠券列表
  Future<PlusApiResultPageUserCouponVO?> getMy(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/coupons/my'), params: params);
    return response is PlusApiResultPageUserCouponVO ? response : null;
  }

  /// 获取用户优惠券详情
  Future<PlusApiResultUserCouponVO?> getUserCouponDetail(String userCouponId) async {
    final response = await _client.get(ApiPaths.appPath('/coupons/my/${userCouponId}'));
    return response is PlusApiResultUserCouponVO ? response : null;
  }

  /// 获取可用优惠券列表
  Future<PlusApiResultPageUserCouponVO?> getAvailable(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/coupons/my/available'), params: params);
    return response is PlusApiResultPageUserCouponVO ? response : null;
  }
}
