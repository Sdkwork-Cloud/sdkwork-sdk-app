import '../http/client.dart';
import '../models.dart';

class VipApi {
  final HttpClient _client;
  
  VipApi(this._client);

  /// 购买VIP
  Future<PlusApiResultVipPurchaseVO?> purchase(VipPurchaseForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vip/purchase'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipPurchaseVO ? response : null;
  }

  /// 升级VIP
  Future<PlusApiResultVipPurchaseVO?> upgrade(VipUpgradeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vip/purchase/upgrade'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipPurchaseVO ? response : null;
  }

  /// 续费VIP
  Future<PlusApiResultVipPurchaseVO?> renew(VipRenewForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vip/purchase/renew'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipPurchaseVO ? response : null;
  }

  /// 使用加速特权
  Future<PlusApiResultVoid?> useSpeedUpPrivilege(SpeedUpForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vip/privilege/speed-up'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 领取每日奖励
  Future<PlusApiResultVipDailyRewardVO?> claimDailyReward() async {
    final response = await _client.post(ApiPaths.appPath('/vip/points/daily-reward'));
    return response is PlusApiResultVipDailyRewardVO ? response : null;
  }

  /// 邀请好友
  Future<PlusApiResultVipInviteVO?> inviteFriend(VipInviteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vip/invite'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipInviteVO ? response : null;
  }

  /// 领取优惠券
  Future<PlusApiResultVoid?> claimCoupon(String couponId) async {
    final response = await _client.post(ApiPaths.appPath('/vip/coupons/${couponId}/claim'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取VIP状态
  Future<PlusApiResultVipStatusVO?> getVipStatus() async {
    final response = await _client.get(ApiPaths.appPath('/vip/status'));
    return response is PlusApiResultVipStatusVO ? response : null;
  }

  /// 获取特权使用情况
  Future<PlusApiResultVipPrivilegeUsageVO?> getPrivilegeUsage() async {
    final response = await _client.get(ApiPaths.appPath('/vip/privilege/usage'));
    return response is PlusApiResultVipPrivilegeUsageVO ? response : null;
  }

  /// 获取积分明细
  Future<PlusApiResultListVipPointsHistoryVO?> getPointsHistory() async {
    final response = await _client.get(ApiPaths.appPath('/vip/points/history'));
    return response is PlusApiResultListVipPointsHistoryVO ? response : null;
  }

  /// 获取每日奖励状态
  Future<PlusApiResultVipDailyRewardStatusVO?> getDailyRewardStatus() async {
    final response = await _client.get(ApiPaths.appPath('/vip/points/daily-reward/status'));
    return response is PlusApiResultVipDailyRewardStatusVO ? response : null;
  }

  /// 获取积分余额
  Future<PlusApiResultLong?> getPointsBalance() async {
    final response = await _client.get(ApiPaths.appPath('/vip/points/balance'));
    return response is PlusApiResultLong ? response : null;
  }

  /// 获取套餐分组列表
  Future<PlusApiResultListVipPackGroupVO?> listPackGroups(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups'), params: params);
    return response is PlusApiResultListVipPackGroupVO ? response : null;
  }

  /// 获取分组详情
  Future<PlusApiResultVipPackGroupDetailVO?> getPackGroupDetail(String groupId) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups/${groupId}'));
    return response is PlusApiResultVipPackGroupDetailVO ? response : null;
  }

  /// 获取分组套餐
  Future<PlusApiResultListVipPackVO?> listPacksByGroup(String groupId) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups/${groupId}/packs'));
    return response is PlusApiResultListVipPackVO ? response : null;
  }

  /// 获取所有套餐
  Future<PlusApiResultListVipPackVO?> listAllPacks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups/packs'), params: params);
    return response is PlusApiResultListVipPackVO ? response : null;
  }

  /// 获取套餐详情
  Future<PlusApiResultVipPackDetailVO?> getPackDetail(String packId) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups/packs/${packId}'));
    return response is PlusApiResultVipPackDetailVO ? response : null;
  }

  /// 对比套餐
  Future<PlusApiResultListVipPackGroupVO?> comparePacks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/pack-groups/compare'), params: params);
    return response is PlusApiResultListVipPackGroupVO ? response : null;
  }

  /// 获取VIP等级列表
  Future<PlusApiResultListVipLevelVO?> listVipLevels() async {
    final response = await _client.get(ApiPaths.appPath('/vip/levels'));
    return response is PlusApiResultListVipLevelVO ? response : null;
  }

  /// 获取邀请规则
  Future<PlusApiResultInviteRulesVO?> getInviteRules() async {
    final response = await _client.get(ApiPaths.appPath('/vip/invite/rules'));
    return response is PlusApiResultInviteRulesVO ? response : null;
  }

  /// 获取邀请记录
  Future<PlusApiResultListVipInviteRecordVO?> getInviteRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/invite/records'), params: params);
    return response is PlusApiResultListVipInviteRecordVO ? response : null;
  }

  /// 获取邀请信息
  Future<PlusApiResultVipInviteInfoVO?> getInviteInfo() async {
    final response = await _client.get(ApiPaths.appPath('/vip/invite/info'));
    return response is PlusApiResultVipInviteInfoVO ? response : null;
  }

  /// 获取VIP信息
  Future<PlusApiResultVipInfoVO?> getVipInfo() async {
    final response = await _client.get(ApiPaths.appPath('/vip/info'));
    return response is PlusApiResultVipInfoVO ? response : null;
  }

  /// 获取VIP优惠券
  Future<PlusApiResultListVipCouponVO?> listVipCoupons() async {
    final response = await _client.get(ApiPaths.appPath('/vip/coupons'));
    return response is PlusApiResultListVipCouponVO ? response : null;
  }

  /// 获取我的优惠券
  Future<PlusApiResultListVipCouponVO?> listMyCoupons(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/coupons/my'), params: params);
    return response is PlusApiResultListVipCouponVO ? response : null;
  }

  /// 检查VIP状态
  Future<PlusApiResultBoolean?> checkVipStatus() async {
    final response = await _client.get(ApiPaths.appPath('/vip/check'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 获取VIP权益
  Future<PlusApiResultListVipBenefitVO?> listVipBenefits(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vip/benefits'), params: params);
    return response is PlusApiResultListVipBenefitVO ? response : null;
  }
}
