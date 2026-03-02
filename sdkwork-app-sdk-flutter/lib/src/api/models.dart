import '../http/client.dart';
import '../models.dart';

class ModelsApi {
  final HttpClient _client;
  
  ModelsApi(this._client);

  /// 批量获取模型价格
  Future<PlusApiResultListModelPriceVO?> getModelPrices(GetModelPricesRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/models/prices/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultListModelPriceVO ? response : null;
  }

  /// 获取模型详情
  Future<PlusApiResultModelInfoDetailVO?> getModelById(String modelId) async {
    final response = await _client.get(ApiPaths.appPath('/models/${modelId}'));
    return response is PlusApiResultModelInfoDetailVO ? response : null;
  }

  /// 获取模型类型列表
  Future<PlusApiResultListModelTypeVO?> getModelTypes() async {
    final response = await _client.get(ApiPaths.appPath('/models/types'));
    return response is PlusApiResultListModelTypeVO ? response : null;
  }

  /// 获取类型模型列表
  Future<PlusApiResultPageModelInfoVO?> getModelsByType(String modelType, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/type/${modelType}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// 获取模型统计
  Future<PlusApiResultModelStatisticsVO?> getModelStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/models/statistics'));
    return response is PlusApiResultModelStatisticsVO ? response : null;
  }

  /// 搜索模型
  Future<PlusApiResultPageModelInfoVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/search'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// 获取模型价格
  Future<PlusApiResultModelPriceVO?> getModelPrice(String model) async {
    final response = await _client.get(ApiPaths.appPath('/models/price/${model}'));
    return response is PlusApiResultModelPriceVO ? response : null;
  }

  /// 获取热门模型
  Future<PlusApiResultPageModelInfoVO?> getPopular(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/popular'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// 获取系列模型列表
  Future<PlusApiResultPageModelInfoVO?> getModelsByFamily(String family, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/family/${family}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// 获取所有模型系列
  Future<PlusApiResultListString?> getAllFamilies() async {
    final response = await _client.get(ApiPaths.appPath('/models/families'));
    return response is PlusApiResultListString ? response : null;
  }

  /// 获取渠道模型列表
  Future<PlusApiResultPageModelInfoVO?> getModelsByChannel(String channel, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/channel/${channel}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// 根据模型标识获取详情
  Future<PlusApiResultModelInfoDetailVO?> getModelBy(String model) async {
    final response = await _client.get(ApiPaths.appPath('/models/by-model/${model}'));
    return response is PlusApiResultModelInfoDetailVO ? response : null;
  }

  /// 获取活跃模型列表
  Future<PlusApiResultPageModelInfoVO?> getActive(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/active'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }
}
