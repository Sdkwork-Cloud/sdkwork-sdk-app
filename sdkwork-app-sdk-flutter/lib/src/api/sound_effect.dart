import '../http/client.dart';
import '../models.dart';

class SoundEffectApi {
  final HttpClient _client;
  
  SoundEffectApi(this._client);

  /// 创建音效生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(SoundEffectGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/sound-effect'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取音效详情
  Future<PlusApiResultSoundEffectGenerationVO?> getEffectDetail(String effectId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/sound-effect/${effectId}'));
    return response is PlusApiResultSoundEffectGenerationVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/sound-effect/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/sound-effect/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/sound-effect/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取音效类别
  Future<PlusApiResultSoundEffectCategoriesVO?> getCategories(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/sound-effect/categories'), params: params);
    return response is PlusApiResultSoundEffectCategoriesVO ? response : null;
  }
}
