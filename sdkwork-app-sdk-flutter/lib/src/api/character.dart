import '../http/client.dart';
import '../models.dart';

class CharacterApi {
  final HttpClient _client;
  
  CharacterApi(this._client);

  /// 获取角色详情
  Future<PlusApiResultCharacterDetailVO?> getCharacter(String characterId) async {
    final response = await _client.get(ApiPaths.appPath('/character/${characterId}'));
    return response is PlusApiResultCharacterDetailVO ? response : null;
  }

  /// 更新角色
  Future<PlusApiResultCharacterVO?> updateCharacter(String characterId, CharacterUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/character/${characterId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultCharacterVO ? response : null;
  }

  /// 删除角色
  Future<PlusApiResultVoid?> deleteCharacter(String characterId) async {
    final response = await _client.delete(ApiPaths.appPath('/character/${characterId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建角色生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(CharacterGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/character'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 批量创建角色生成任务
  Future<PlusApiResultListGenerationTaskVO?> batchCreateGeneration(CharacterBatchGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/character/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultListGenerationTaskVO ? response : null;
  }

  /// 创建角色
  Future<PlusApiResultCharacterVO?> createCharacter(CharacterCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/character'), body: body, contentType: 'application/json');
    return response is PlusApiResultCharacterVO ? response : null;
  }

  /// 使用角色
  Future<PlusApiResultVoid?> use(String characterId) async {
    final response = await _client.post(ApiPaths.appPath('/character/${characterId}/use'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 点赞角色
  Future<PlusApiResultVoid?> like(String characterId) async {
    final response = await _client.post(ApiPaths.appPath('/character/${characterId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消点赞
  Future<PlusApiResultVoid?> unlike(String characterId) async {
    final response = await _client.delete(ApiPaths.appPath('/character/${characterId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取角色详情
  Future<PlusApiResultCharacterGenerationVO?> getCharacterDetail(String characterId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/character/${characterId}'));
    return response is PlusApiResultCharacterGenerationVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/character/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/character/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/character/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取角色列表
  Future<PlusApiResultPageCharacterListVO?> listCharacters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/character/list'), params: params);
    return response is PlusApiResultPageCharacterListVO ? response : null;
  }

  /// 搜索角色
  Future<PlusApiResultPageCharacterVO?> searchCharacters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/character/search'), params: params);
    return response is PlusApiResultPageCharacterVO ? response : null;
  }

  /// 获取热门角色
  Future<PlusApiResultPageCharacterVO?> getPopularCharacters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/character/popular'), params: params);
    return response is PlusApiResultPageCharacterVO ? response : null;
  }

  /// 获取我的角色
  Future<PlusApiResultPageCharacterVO?> getMyCharacters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/character/my'), params: params);
    return response is PlusApiResultPageCharacterVO ? response : null;
  }

  /// 获取最受喜爱角色
  Future<PlusApiResultPageCharacterVO?> getMostLikedCharacters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/character/liked'), params: params);
    return response is PlusApiResultPageCharacterVO ? response : null;
  }

  /// 获取智能体关联角色
  Future<PlusApiResultCharacterVO?> getCharacterByAgent(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/character/agent/${agentId}'));
    return response is PlusApiResultCharacterVO ? response : null;
  }
}
