import '../http/client.dart';
import '../models.dart';

class ToolApi {
  final HttpClient _client;
  
  ToolApi(this._client);

  /// Update tool credentials
  Future<PlusApiResultMapStringObject?> updateCredentials(String toolId, UpdateCredentialsRequest? body) async {
    final response = await _client.put(ApiPaths.appPath('/tools/my/${toolId}/credentials'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List my tools
  Future<PlusApiResultListMapStringObject?> listMine() async {
    final response = await _client.get(ApiPaths.appPath('/tools/my'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Install tool
  Future<PlusApiResultMapStringObject?> install(InstallRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/tools/my'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Test tool
  Future<PlusApiResultMapStringObject?> test(String toolId) async {
    final response = await _client.post(ApiPaths.appPath('/tools/market/${toolId}/test'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List tool market
  Future<PlusApiResultListMapStringObject?> listMarket(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/tools/market'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Get tool market item
  Future<PlusApiResultMapStringObject?> getMarketItem(String toolId) async {
    final response = await _client.get(ApiPaths.appPath('/tools/market/${toolId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List tool categories
  Future<PlusApiResultListMapStringObject?> listCategories() async {
    final response = await _client.get(ApiPaths.appPath('/tools/categories'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Uninstall tool
  Future<PlusApiResultVoid?> uninstall(String toolId) async {
    final response = await _client.delete(ApiPaths.appPath('/tools/my/${toolId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
