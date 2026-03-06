import '../http/client.dart';
import '../models.dart';

class VoiceSpeakerApi {
  final HttpClient _client;
  
  VoiceSpeakerApi(this._client);

  /// 获取发音人详情
  Future<PlusApiResultVoiceSpeakerDetailVO?> getSpeakerDetail(String speakerId) async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers/${speakerId}'));
    return response is PlusApiResultVoiceSpeakerDetailVO ? response : null;
  }

  /// 更新发音人
  Future<PlusApiResultVoiceSpeakerVO?> updateSpeaker(String speakerId, VoiceSpeakerCreateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/voice-speakers/${speakerId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoiceSpeakerVO ? response : null;
  }

  /// 删除发音人
  Future<PlusApiResultVoid?> deleteSpeaker(String speakerId) async {
    final response = await _client.delete(ApiPaths.appPath('/voice-speakers/${speakerId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取发音人列表
  Future<PlusApiResultPageVoiceSpeakerVO?> listSpeakers(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers'), params: params);
    return response is PlusApiResultPageVoiceSpeakerVO ? response : null;
  }

  /// 创建发音人
  Future<PlusApiResultVoiceSpeakerVO?> createSpeaker(VoiceSpeakerCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/voice-speakers'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoiceSpeakerVO ? response : null;
  }

  /// 更新发音人状态
  Future<PlusApiResultVoid?> updateStatus(String speakerId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/voice-speakers/${speakerId}/status'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 设为默认发音人
  Future<PlusApiResultVoiceSpeakerVO?> setAsDefault(String speakerId) async {
    final response = await _client.post(ApiPaths.appPath('/voice-speakers/${speakerId}/set-default'));
    return response is PlusApiResultVoiceSpeakerVO ? response : null;
  }

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

  /// 获取发音人统计
  Future<PlusApiResultSpeakerStatisticsVO?> getStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers/statistics'));
    return response is PlusApiResultSpeakerStatisticsVO ? response : null;
  }

  /// 获取默认发音人
  Future<PlusApiResultVoiceSpeakerVO?> getDefaultSpeaker() async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers/default'));
    return response is PlusApiResultVoiceSpeakerVO ? response : null;
  }

  /// 根据代码获取发音人
  Future<PlusApiResultVoiceSpeakerVO?> getSpeakerByCode(String code) async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers/code/${code}'));
    return response is PlusApiResultVoiceSpeakerVO ? response : null;
  }

  /// 获取渠道发音人
  Future<PlusApiResultListVoiceSpeakerVO?> listSpeakersByChannel(String channel) async {
    final response = await _client.get(ApiPaths.appPath('/voice-speakers/channel/${channel}'));
    return response is PlusApiResultListVoiceSpeakerVO ? response : null;
  }

  /// 获取说话人详情
  Future<PlusApiResultVoiceSpeakerGenerationVO?> getSpeakerDetailVoice(String speakerId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/${speakerId}'));
    return response is PlusApiResultVoiceSpeakerGenerationVO ? response : null;
  }

  /// 删除说话人
  Future<PlusApiResultVoid?> deleteSpeakerVoice(String speakerId) async {
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
  Future<PlusApiResultPageVoiceSpeakerListVO?> getListSpeakers(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/voice-speaker/list'), params: params);
    return response is PlusApiResultPageVoiceSpeakerListVO ? response : null;
  }
}
