import '../http/client.dart';
import '../models.dart';

class AuditApi {
  final HttpClient _client;
  
  AuditApi(this._client);

  /// 审核申诉
  Future<PlusApiResultAuditAppealVO?> submitAppeal(String recordId, AuditAppealForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/${recordId}/appeal'), body: body, contentType: 'application/json');
    return response is PlusApiResultAuditAppealVO ? response : null;
  }

  /// 视频审核
  Future<PlusApiResultVideoAuditVO?> video(VideoAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/video'), body: body, contentType: 'application/json');
    return response is PlusApiResultVideoAuditVO ? response : null;
  }

  /// 文本审核
  Future<PlusApiResultTextAuditVO?> text(TextAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/text'), body: body, contentType: 'application/json');
    return response is PlusApiResultTextAuditVO ? response : null;
  }

  /// 文本替换建议
  Future<PlusApiResultTextSuggestVO?> suggestTextReplacement(TextSuggestForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/text/suggest'), body: body, contentType: 'application/json');
    return response is PlusApiResultTextSuggestVO ? response : null;
  }

  /// 批量文本审核
  Future<PlusApiResultBatchTextAuditVO?> batchAuditText(BatchTextAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/text/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultBatchTextAuditVO ? response : null;
  }

  /// 敏感词检测
  Future<PlusApiResultSensitiveWordsVO?> detectSensitiveWords(SensitiveWordsForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/sensitive-words'), body: body, contentType: 'application/json');
    return response is PlusApiResultSensitiveWordsVO ? response : null;
  }

  /// 行为风险检测
  Future<PlusApiResultBehaviorRiskVO?> checkBehaviorRisk(BehaviorRiskCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/risk/behavior'), body: body, contentType: 'application/json');
    return response is PlusApiResultBehaviorRiskVO ? response : null;
  }

  /// 账号风险检测
  Future<PlusApiResultAccountRiskVO?> checkAccountRisk(AccountRiskCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/risk/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultAccountRiskVO ? response : null;
  }

  /// 实时内容审核
  Future<PlusApiResultRealtimeAuditVO?> realtime(RealtimeAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/realtime'), body: body, contentType: 'application/json');
    return response is PlusApiResultRealtimeAuditVO ? response : null;
  }

  /// 图片审核
  Future<PlusApiResultImageAuditVO?> image(ImageAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/image'), body: body, contentType: 'application/json');
    return response is PlusApiResultImageAuditVO ? response : null;
  }

  /// 图片OCR审核
  Future<PlusApiResultImageOcrAuditVO?> imageOcr(ImageOcrAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/image/ocr'), body: body, contentType: 'application/json');
    return response is PlusApiResultImageOcrAuditVO ? response : null;
  }

  /// 批量图片审核
  Future<PlusApiResultBatchImageAuditVO?> batchAuditImage(BatchImageAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/image/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultBatchImageAuditVO ? response : null;
  }

  /// 综合内容审核
  Future<PlusApiResultContentAuditVO?> content(ContentAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultContentAuditVO ? response : null;
  }

  /// 音频审核
  Future<PlusApiResultAudioAuditVO?> audio(AudioAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/audio'), body: body, contentType: 'application/json');
    return response is PlusApiResultAudioAuditVO ? response : null;
  }

  /// 语音审核
  Future<PlusApiResultAudioAsrAuditVO?> audioAsr(AudioAsrAuditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/audit/audio/asr'), body: body, contentType: 'application/json');
    return response is PlusApiResultAudioAsrAuditVO ? response : null;
  }

  /// 敏感词库
  Future<PlusApiResultListSensitiveWordListVO?> listSensitiveWord() async {
    final response = await _client.get(ApiPaths.appPath('/audit/word-lists'));
    return response is PlusApiResultListSensitiveWordListVO ? response : null;
  }

  /// 视频审核状态
  Future<PlusApiResultVideoAuditStatusVO?> getVideoAuditStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/audit/video/${taskId}'));
    return response is PlusApiResultVideoAuditStatusVO ? response : null;
  }

  /// 审核记录
  Future<PlusApiResultPageAuditRecordVO?> listAuditRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/audit/records'), params: params);
    return response is PlusApiResultPageAuditRecordVO ? response : null;
  }

  /// 审核记录详情
  Future<PlusApiResultAuditRecordDetailVO?> getAuditRecord(String recordId) async {
    final response = await _client.get(ApiPaths.appPath('/audit/records/${recordId}'));
    return response is PlusApiResultAuditRecordDetailVO ? response : null;
  }

  /// 审核策略
  Future<PlusApiResultListAuditPolicyVO?> listAuditPolicies() async {
    final response = await _client.get(ApiPaths.appPath('/audit/policies'));
    return response is PlusApiResultListAuditPolicyVO ? response : null;
  }

  /// 我的审核记录
  Future<PlusApiResultPageAuditRecordVO?> listMyAuditRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/audit/my-records'), params: params);
    return response is PlusApiResultPageAuditRecordVO ? response : null;
  }

  /// 申诉记录
  Future<PlusApiResultPageAuditAppealVO?> listAppeals() async {
    final response = await _client.get(ApiPaths.appPath('/audit/appeals'));
    return response is PlusApiResultPageAuditAppealVO ? response : null;
  }

  /// 申诉状态
  Future<PlusApiResultAuditAppealStatusVO?> getAppealStatus(String appealId) async {
    final response = await _client.get(ApiPaths.appPath('/audit/appeals/${appealId}'));
    return response is PlusApiResultAuditAppealStatusVO ? response : null;
  }
}
