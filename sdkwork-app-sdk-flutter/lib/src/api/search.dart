import '../http/client.dart';
import '../models.dart';

class SearchApi {
  final HttpClient _client;
  
  SearchApi(this._client);

  /// 搜索历史
  Future<PlusApiResultListSearchHistoryVO?> getSearchHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/history'), params: params);
    return response is PlusApiResultListSearchHistoryVO ? response : null;
  }

  /// 添加搜索历史
  Future<PlusApiResultVoid?> addSearchHistory(SearchHistoryAddRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/search/history'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 清空搜索历史
  Future<PlusApiResultVoid?> clearSearchHistory() async {
    final response = await _client.delete(ApiPaths.appPath('/search/history'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 高级搜索
  Future<PlusApiResultPageSearchResult?> advanced(AdvancedSearchRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/search/advanced'), body: body, contentType: 'application/json');
    return response is PlusApiResultPageSearchResult ? response : null;
  }

  /// 全局搜索
  Future<PlusApiResultGlobalSearchVO?> global(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search'), params: params);
    return response is PlusApiResultGlobalSearchVO ? response : null;
  }

  /// 搜索用户
  Future<PlusApiResultPageUserSearchResult?> users(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/users'), params: params);
    return response is PlusApiResultPageUserSearchResult ? response : null;
  }

  /// 搜索建议
  Future<PlusApiResultListSearchSuggestionVO?> getSearchSuggestions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/suggestions'), params: params);
    return response is PlusApiResultListSearchSuggestionVO ? response : null;
  }

  /// 搜索统计
  Future<PlusApiResultSearchStatisticsVO?> getSearchStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/search/statistics'));
    return response is PlusApiResultSearchStatisticsVO ? response : null;
  }

  /// 搜索项目
  Future<PlusApiResultPageProjectSearchResult?> projects(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/projects'), params: params);
    return response is PlusApiResultPageProjectSearchResult ? response : null;
  }

  /// 搜索笔记
  Future<PlusApiResultPageNoteSearchResult?> notes(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/notes'), params: params);
    return response is PlusApiResultPageNoteSearchResult ? response : null;
  }

  /// 热门搜索
  Future<PlusApiResultListHotSearchVO?> getHotSearches(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/hot'), params: params);
    return response is PlusApiResultListHotSearchVO ? response : null;
  }

  /// 筛选条件
  Future<PlusApiResultSearchFiltersVO?> getSearchFilters(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/filters'), params: params);
    return response is PlusApiResultSearchFiltersVO ? response : null;
  }

  /// 搜索资源
  Future<PlusApiResultPageAssetSearchResult?> assets(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/search/assets'), params: params);
    return response is PlusApiResultPageAssetSearchResult ? response : null;
  }

  /// 删除搜索历史
  Future<PlusApiResultVoid?> deleteSearchHistory(String keyword) async {
    final response = await _client.delete(ApiPaths.appPath('/search/history/${keyword}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
