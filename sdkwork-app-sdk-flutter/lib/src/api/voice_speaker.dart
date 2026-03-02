import '../http/client.dart';
import '../models.dart';

class VoiceSpeakerApi {
  final HttpClient _client;
  
  VoiceSpeakerApi(this._client);

  /// 创建语音生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(VoiceSpeakerGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/voice-speaker'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 克隆说话人
  Future<PlusApiResultGenerationTaskVO?> cloneSpeaker(VoiceSpeakerCloneForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/voice-speaker/clone'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取说话人详情
  Future<PlusApiResultVoiceSpeakerGenerationVO?> getSpeakerDetail(String speakerId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/${speakerId}'));
    return response is PlusApiResultVoiceSpeakerGenerationVO ? response : null;
  }

  /// 删除说话人
  Future<PlusApiResultVoid?> deleteSpeaker(String speakerId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/voice-speaker/${speakerId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/voice-speaker/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取说话人列表
  Future<PlusApiResultPageVoiceSpeakerListVO?> listSpeakers(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/list'), params: params);
    return response is PlusApiResultPageVoiceSpeakerListVO ? response : null;
  }
}
