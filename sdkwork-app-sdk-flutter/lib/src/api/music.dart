import '../http/client.dart';
import '../models.dart';

class MusicApi {
  final HttpClient _client;
  
  MusicApi(this._client);

  /// 获取音乐详情
  Future<PlusApiResultMusicDetailVO?> getMusic(String musicId) async {
    final response = await _client.get(ApiPaths.appPath('/music/${musicId}'));
    return response is PlusApiResultMusicDetailVO ? response : null;
  }

  /// 更新音乐
  Future<PlusApiResultMusicVO?> updateMusic(String musicId, MusicUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/music/${musicId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultMusicVO ? response : null;
  }

  /// 删除音乐
  Future<PlusApiResultVoid?> deleteMusic(String musicId) async {
    final response = await _client.delete(ApiPaths.appPath('/music/${musicId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上传音乐
  Future<PlusApiResultMusicVO?> createMusic(MusicCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/music'), body: body, contentType: 'application/json');
    return response is PlusApiResultMusicVO ? response : null;
  }

  /// 发布音乐
  Future<PlusApiResultVoid?> publish(String musicId) async {
    final response = await _client.post(ApiPaths.appPath('/music/${musicId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消发布
  Future<PlusApiResultVoid?> unpublish(String musicId) async {
    final response = await _client.delete(ApiPaths.appPath('/music/${musicId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 点赞音乐
  Future<PlusApiResultVoid?> like(String musicId) async {
    final response = await _client.post(ApiPaths.appPath('/music/${musicId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消点赞
  Future<PlusApiResultVoid?> unlike(String musicId) async {
    final response = await _client.delete(ApiPaths.appPath('/music/${musicId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏音乐
  Future<PlusApiResultVoid?> favorite(String musicId) async {
    final response = await _client.post(ApiPaths.appPath('/music/${musicId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏
  Future<PlusApiResultVoid?> unfavorite(String musicId) async {
    final response = await _client.delete(ApiPaths.appPath('/music/${musicId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 记录下载
  Future<PlusApiResultVoid?> recordDownload(String musicId) async {
    final response = await _client.post(ApiPaths.appPath('/music/${musicId}/download'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建音乐生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(MusicGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/music'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 相似音乐生成
  Future<PlusApiResultGenerationTaskVO?> generateSimilar(MusicSimilarForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/music/similar'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 音乐混音
  Future<PlusApiResultGenerationTaskVO?> remix(MusicRemixForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/music/remix'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 音乐续写
  Future<PlusApiResultGenerationTaskVO?> extend(MusicExtendForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/music/extend'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取音乐统计
  Future<PlusApiResultMusicStatisticsVO?> getMusicStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/music/statistics'));
    return response is PlusApiResultMusicStatisticsVO ? response : null;
  }

  /// 搜索音乐
  Future<PlusApiResultPageMusicVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/music/search'), params: params);
    return response is PlusApiResultPageMusicVO ? response : null;
  }

  /// 获取公开音乐
  Future<PlusApiResultPageMusicVO?> getPublic(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/music/public'), params: params);
    return response is PlusApiResultPageMusicVO ? response : null;
  }

  /// 获取热门音乐
  Future<PlusApiResultPageMusicVO?> getPopular(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/music/popular'), params: params);
    return response is PlusApiResultPageMusicVO ? response : null;
  }

  /// 获取最受喜爱音乐
  Future<PlusApiResultPageMusicVO?> getMostLiked(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/music/liked'), params: params);
    return response is PlusApiResultPageMusicVO ? response : null;
  }

  /// 获取收藏音乐
  Future<PlusApiResultPageMusicVO?> getFavorite(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/music/favorites'), params: params);
    return response is PlusApiResultPageMusicVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/music/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/music/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/music/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取音乐风格列表
  Future<PlusApiResultMusicStylesVO?> getMusicStyles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/music/styles'), params: params);
    return response is PlusApiResultMusicStylesVO ? response : null;
  }
}
