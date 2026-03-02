import '../http/client.dart';
import '../models.dart';

class VoiceSpeakersApi {
  final HttpClient _client;
  
  VoiceSpeakersApi(this._client);

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
}
