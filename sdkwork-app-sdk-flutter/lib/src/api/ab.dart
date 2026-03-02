import '../http/client.dart';
import '../models.dart';

class AbApi {
  final HttpClient _client;
  
  AbApi(this._client);

  /// 实验反馈
  Future<PlusApiResultVoid?> submitExperimentFeedback(String experimentId, ExperimentFeedbackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/${experimentId}/feedback'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 退出实验
  Future<PlusApiResultVoid?> exitExperiment(String experimentId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/${experimentId}/exit'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 所有特性开关
  Future<PlusApiResultListFeatureFlagVO?> listFeatureFlags() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/features'));
    return response is PlusApiResultListFeatureFlagVO ? response : null;
  }

  /// 批量特性开关
  Future<PlusApiResultMapStringFeatureFlagVO?> batchCheckFeatures(BatchFeatureCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/features'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringFeatureFlagVO ? response : null;
  }

  /// 上报实验曝光
  Future<PlusApiResultVoid?> trackExperimentExposure(ExperimentExposureForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/exposure'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报实验事件
  Future<PlusApiResultVoid?> trackExperimentEvent(ExperimentEventForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/events'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报实验转化
  Future<PlusApiResultVoid?> trackExperimentConversion(ExperimentConversionForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/conversion'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量获取分组
  Future<PlusApiResultMapStringExperimentAssignmentVO?> batchGetAssignments(BatchAssignmentForm body) async {
    final response = await _client.post(ApiPaths.appPath('/abtest/assignments'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringExperimentAssignmentVO ? response : null;
  }

  /// 实验结果
  Future<PlusApiResultExperimentResultsVO?> getExperimentResults(String experimentId) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/${experimentId}/results'));
    return response is PlusApiResultExperimentResultsVO ? response : null;
  }

  /// 实验报告
  Future<PlusApiResultExperimentReportVO?> getExperimentReport(String experimentId) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/${experimentId}/report'));
    return response is PlusApiResultExperimentReportVO ? response : null;
  }

  /// UI配置
  Future<PlusApiResultUiConfigVO?> getUiConfig() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/ui-config'));
    return response is PlusApiResultUiConfigVO ? response : null;
  }

  /// 灰度配置
  Future<PlusApiResultListRolloutConfigVO?> listRolloutConfigs() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/rollouts'));
    return response is PlusApiResultListRolloutConfigVO ? response : null;
  }

  /// 灰度发布
  Future<PlusApiResultRolloutCheckVO?> checkRollout(String rolloutKey) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/rollout/${rolloutKey}'));
    return response is PlusApiResultRolloutCheckVO ? response : null;
  }

  /// 特性开关
  Future<PlusApiResultFeatureFlagVO?> checkFeatureFlag(String featureKey) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/features/${featureKey}'));
    return response is PlusApiResultFeatureFlagVO ? response : null;
  }

  /// 可用实验
  Future<PlusApiResultListExperimentVO?> listAvailableExperiments() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/experiments'));
    return response is PlusApiResultListExperimentVO ? response : null;
  }

  /// 实验详情
  Future<PlusApiResultExperimentDetailVO?> getExperimentDetail(String experimentId) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/experiments/${experimentId}'));
    return response is PlusApiResultExperimentDetailVO ? response : null;
  }

  /// 个性化配置
  Future<PlusApiResultMapStringObject?> getPersonalizedConfig() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/config'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// 获取实验分组
  Future<PlusApiResultExperimentAssignmentVO?> getExperimentAssignment(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/abtest/assignment'), params: params);
    return response is PlusApiResultExperimentAssignmentVO ? response : null;
  }

  /// 算法配置
  Future<PlusApiResultAlgorithmConfigVO?> getAlgorithmConfig() async {
    final response = await _client.get(ApiPaths.appPath('/abtest/algorithm-config'));
    return response is PlusApiResultAlgorithmConfigVO ? response : null;
  }
}
