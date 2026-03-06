import '../http/client.dart';
import '../models.dart';

class ModelApi {
  final HttpClient _client;
  
  ModelApi(this._client);

  /// Batch get model prices
  Future<PlusApiResultListModelPriceVO?> getModelPrices(GetModelPricesRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/models/prices/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultListModelPriceVO ? response : null;
  }

  /// Get model detail
  Future<PlusApiResultModelInfoDetailVO?> getModelById(String modelId) async {
    final response = await _client.get(ApiPaths.appPath('/models/${modelId}'));
    return response is PlusApiResultModelInfoDetailVO ? response : null;
  }

  /// Get model types
  Future<PlusApiResultListModelTypeVO?> getModelTypes() async {
    final response = await _client.get(ApiPaths.appPath('/models/types'));
    return response is PlusApiResultListModelTypeVO ? response : null;
  }

  /// Get models by type
  Future<PlusApiResultPageModelInfoVO?> getModelsByType(String modelType, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/type/${modelType}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// Get model statistics
  Future<PlusApiResultModelStatisticsVO?> getModelStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/models/statistics'));
    return response is PlusApiResultModelStatisticsVO ? response : null;
  }

  /// Search models
  Future<PlusApiResultPageModelInfoVO?> searchModels(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/search'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// Get model default price
  Future<PlusApiResultModelPriceVO?> getModelPrice(String model) async {
    final response = await _client.get(ApiPaths.appPath('/models/price/${model}'));
    return response is PlusApiResultModelPriceVO ? response : null;
  }

  /// Get model pricing rules
  Future<PlusApiResultListModelPriceVO?> getModelPriceRules(String model, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/price-rules/${model}'), params: params);
    return response is PlusApiResultListModelPriceVO ? response : null;
  }

  /// Get popular models
  Future<PlusApiResultPageModelInfoVO?> getPopularModels(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/popular'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// Get models by family
  Future<PlusApiResultPageModelInfoVO?> getModelsByFamily(String family, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/family/${family}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// Get all families
  Future<PlusApiResultListString?> getAllFamilies() async {
    final response = await _client.get(ApiPaths.appPath('/models/families'));
    return response is PlusApiResultListString ? response : null;
  }

  /// Get models by channel
  Future<PlusApiResultPageModelInfoVO?> getModelsByChannel(String channel, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/channel/${channel}'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }

  /// Get model detail by alias
  Future<PlusApiResultModelInfoDetailVO?> getModelBy(String model) async {
    final response = await _client.get(ApiPaths.appPath('/models/by-model/${model}'));
    return response is PlusApiResultModelInfoDetailVO ? response : null;
  }

  /// Get active models
  Future<PlusApiResultPageModelInfoVO?> getActiveModels(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/models/active'), params: params);
    return response is PlusApiResultPageModelInfoVO ? response : null;
  }
}
