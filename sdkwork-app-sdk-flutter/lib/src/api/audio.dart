import '../http/client.dart';
import '../models.dart';

class AudioApi {
  final HttpClient _client;
  
  AudioApi(this._client);

  /// 语音克隆
  Future<PlusApiResultGenerationTaskVO?> voiceClone(VoiceCloneForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/audio/voice-clone'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 文本转语音
  Future<PlusApiResultGenerationTaskVO?> textToSpeech(AudioGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/audio/tts'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 语音翻译
  Future<PlusApiResultGenerationTaskVO?> translation(AudioTranslationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/audio/translation'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 语音转文本
  Future<PlusApiResultGenerationTaskVO?> transcription(AudioTranscriptionForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/audio/transcription'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取语音列表
  Future<PlusApiResultVoiceListVO?> getVoiceList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/audio/voices'), params: params);
    return response is PlusApiResultVoiceListVO ? response : null;
  }

  /// 获取转录结果
  Future<PlusApiResultGenerationTaskVO?> getTranscriptionResult(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/audio/transcription/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/audio/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/audio/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/audio/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
