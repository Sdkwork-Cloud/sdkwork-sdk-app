import '../http/client.dart';
import '../models.dart';

class DashboardApi {
  final HttpClient _client;
  
  DashboardApi(this._client);

  /// 完成待办
  Future<PlusApiResultVoid?> completeTodoItem(String todoId) async {
    final response = await _client.put(ApiPaths.appPath('/dashboard/todos/${todoId}/complete'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 快捷入口
  Future<PlusApiResultListShortcutVO?> getShortcuts() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/shortcuts'));
    return response is PlusApiResultListShortcutVO ? response : null;
  }

  /// 更新快捷入口
  Future<PlusApiResultVoid?> updateShortcuts(ShortcutsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/dashboard/shortcuts'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 领取成就奖励
  Future<PlusApiResultAchievementRewardVO?> claimAchievementReward(String achievementId) async {
    final response = await _client.post(ApiPaths.appPath('/dashboard/achievements/${achievementId}/claim'));
    return response is PlusApiResultAchievementRewardVO ? response : null;
  }

  /// 今日热点
  Future<PlusApiResultListTrendingItemVO?> getTrendingItems(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/trending'), params: params);
    return response is PlusApiResultListTrendingItemVO ? response : null;
  }

  /// 待办事项
  Future<PlusApiResultListTodoItemVO?> getTodoItems() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/todos'));
    return response is PlusApiResultListTodoItemVO ? response : null;
  }

  /// 用户统计
  Future<PlusApiResultUserStatisticsVO?> getUserStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/statistics'));
    return response is PlusApiResultUserStatisticsVO ? response : null;
  }

  /// 会员统计
  Future<PlusApiResultVipStatisticsVO?> getVipStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/statistics/vip'));
    return response is PlusApiResultVipStatisticsVO ? response : null;
  }

  /// 使用统计
  Future<PlusApiResultUsageStatisticsVO?> getUsageStatistics(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/statistics/usage'), params: params);
    return response is PlusApiResultUsageStatisticsVO ? response : null;
  }

  /// 存储统计
  Future<PlusApiResultStorageStatisticsVO?> getStorageStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/statistics/storage'));
    return response is PlusApiResultStorageStatisticsVO ? response : null;
  }

  /// 生成统计
  Future<PlusApiResultGenerationStatisticsVO?> getGenerationStatistics(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/statistics/generations'), params: params);
    return response is PlusApiResultGenerationStatisticsVO ? response : null;
  }

  /// 推荐内容
  Future<PlusApiResultListRecommendationVO?> getRecommendations(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/recommendations'), params: params);
    return response is PlusApiResultListRecommendationVO ? response : null;
  }

  /// 数据概览
  Future<PlusApiResultMapStringObject?> getDataOverview() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/overview'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// 用户等级
  Future<PlusApiResultUserLevelVO?> getUserLevel() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/level'));
    return response is PlusApiResultUserLevelVO ? response : null;
  }

  /// 首页数据
  Future<PlusApiResultHomeDashboardVO?> getHome() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/home'));
    return response is PlusApiResultHomeDashboardVO ? response : null;
  }

  /// 图表数据
  Future<PlusApiResultChartDataVO?> getChartData(String chartType, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/charts/${chartType}'), params: params);
    return response is PlusApiResultChartDataVO ? response : null;
  }

  /// 最近活动
  Future<PlusApiResultListRecentActivityVO?> getRecentActivities(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/activities'), params: params);
    return response is PlusApiResultListRecentActivityVO ? response : null;
  }

  /// 成就列表
  Future<PlusApiResultListAchievementVO?> getAchievements() async {
    final response = await _client.get(ApiPaths.appPath('/dashboard/achievements'));
    return response is PlusApiResultListAchievementVO ? response : null;
  }
}
