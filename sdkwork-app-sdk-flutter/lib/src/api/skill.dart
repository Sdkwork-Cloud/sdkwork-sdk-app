import '../http/client.dart';
import '../models.dart';

class SkillApi {
  final HttpClient _client;
  
  SkillApi(this._client);

  /// Get skill detail
  Future<PlusApiResultSkillVO?> detail(String skillId) async {
    final response = await _client.get(ApiPaths.appPath('/skills/${skillId}'));
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Update skill
  Future<PlusApiResultSkillVO?> update(String skillId, SkillSaveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/skills/${skillId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Update user skill config
  Future<PlusApiResultUserSkillVO?> updateConfig(String skillId, SkillConfigUpdateForm? body) async {
    final response = await _client.put(ApiPaths.appPath('/skills/${skillId}/config'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserSkillVO ? response : null;
  }

  /// List market skills
  Future<PlusApiResultPageSkillVO?> list(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/skills'), params: params);
    return response is PlusApiResultPageSkillVO ? response : null;
  }

  /// Create skill
  Future<PlusApiResultSkillVO?> create(SkillSaveForm body) async {
    final response = await _client.post(ApiPaths.appPath('/skills'), body: body, contentType: 'application/json');
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Submit skill for review
  Future<PlusApiResultSkillVO?> submitReview(String skillId) async {
    final response = await _client.post(ApiPaths.appPath('/skills/${skillId}/submit-review'));
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Publish skill to market
  Future<PlusApiResultSkillVO?> publish(String skillId) async {
    final response = await _client.post(ApiPaths.appPath('/skills/${skillId}/publish'));
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Offline skill from market
  Future<PlusApiResultSkillVO?> offline(String skillId) async {
    final response = await _client.post(ApiPaths.appPath('/skills/${skillId}/offline'));
    return response is PlusApiResultSkillVO ? response : null;
  }

  /// Enable skill for current user
  Future<PlusApiResultUserSkillVO?> enable(String skillId) async {
    final response = await _client.post(ApiPaths.appPath('/skills/${skillId}/enable'));
    return response is PlusApiResultUserSkillVO ? response : null;
  }

  /// Disable skill for current user
  Future<PlusApiResultBoolean?> disable(String skillId) async {
    final response = await _client.post(ApiPaths.appPath('/skills/${skillId}/disable'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// List skill packages
  Future<PlusApiResultListSkillPackageVO?> listPackages() async {
    final response = await _client.get(ApiPaths.appPath('/skills/packages'));
    return response is PlusApiResultListSkillPackageVO ? response : null;
  }

  /// List my installed skills
  Future<PlusApiResultListUserSkillVO?> listMine() async {
    final response = await _client.get(ApiPaths.appPath('/skills/my'));
    return response is PlusApiResultListUserSkillVO ? response : null;
  }

  /// List skill categories
  Future<PlusApiResultListSkillCategoryVO?> listCategories() async {
    final response = await _client.get(ApiPaths.appPath('/skills/categories'));
    return response is PlusApiResultListSkillCategoryVO ? response : null;
  }
}
