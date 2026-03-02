import '../http/client.dart';
import '../models.dart';

class PartnerApi {
  final HttpClient _client;
  
  PartnerApi(this._client);

  /// 获取合作伙伴详情
  Future<PlusApiResultPartnerDetailVO?> getPartner(String partnerId) async {
    final response = await _client.get(ApiPaths.appPath('/partner/${partnerId}'));
    return response is PlusApiResultPartnerDetailVO ? response : null;
  }

  /// 更新合作伙伴
  Future<PlusApiResultPartnerVO?> updatePartner(String partnerId, PartnerUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/partner/${partnerId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPartnerVO ? response : null;
  }

  /// 删除合作伙伴
  Future<PlusApiResultVoid?> deletePartner(String partnerId) async {
    final response = await _client.delete(ApiPaths.appPath('/partner/${partnerId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 申请成为合作伙伴
  Future<PlusApiResultPartnerVO?> createPartner(PartnerCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/partner'), body: body, contentType: 'application/json');
    return response is PlusApiResultPartnerVO ? response : null;
  }

  /// 提现佣金
  Future<PlusApiResultVoid?> withdrawCommission(String partnerId, CommissionForm body) async {
    final response = await _client.post(ApiPaths.appPath('/partner/${partnerId}/withdraw'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 审批拒绝
  Future<PlusApiResultVoid?> reject(String partnerId) async {
    final response = await _client.post(ApiPaths.appPath('/partner/${partnerId}/reject'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 添加佣金
  Future<PlusApiResultVoid?> addCommission(String partnerId, CommissionForm body) async {
    final response = await _client.post(ApiPaths.appPath('/partner/${partnerId}/commission'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 审批通过
  Future<PlusApiResultVoid?> approve(String partnerId) async {
    final response = await _client.post(ApiPaths.appPath('/partner/${partnerId}/approve'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取下级合作伙伴
  Future<PlusApiResultPagePartnerVO?> getSubordinates(String partnerId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/partner/subordinates/${partnerId}'), params: params);
    return response is PlusApiResultPagePartnerVO ? response : null;
  }

  /// 获取合作伙伴统计
  Future<PlusApiResultPartnerStatisticsVO?> getPartnerStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/partner/statistics'));
    return response is PlusApiResultPartnerStatisticsVO ? response : null;
  }

  /// 搜索合作伙伴
  Future<PlusApiResultPagePartnerVO?> searchPartners(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/partner/search'), params: params);
    return response is PlusApiResultPagePartnerVO ? response : null;
  }

  /// 获取我的合作伙伴信息
  Future<PlusApiResultPartnerDetailVO?> getMy() async {
    final response = await _client.get(ApiPaths.appPath('/partner/my'));
    return response is PlusApiResultPartnerDetailVO ? response : null;
  }

  /// 根据推广码查询
  Future<PlusApiResultPartnerVO?> getByPromotionCode(String promotionCode) async {
    final response = await _client.get(ApiPaths.appPath('/partner/code/${promotionCode}'));
    return response is PlusApiResultPartnerVO ? response : null;
  }
}
