import '../http/client.dart';
import '../models.dart';

class VideoApi {
  final HttpClient _client;
  
  VideoApi(this._client);

  /// 获取视频详情
  Future<PlusApiResultVideoDetailVO?> getVideo(String videoId) async {
    final response = await _client.get(ApiPaths.appPath('/video/${videoId}'));
    return response is PlusApiResultVideoDetailVO ? response : null;
  }

  /// 更新视频
  Future<PlusApiResultVideoVO?> updateVideo(String videoId, VideoUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/video/${videoId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVideoVO ? response : null;
  }

  /// 删除视频
  Future<PlusApiResultVoid?> deleteVideo(String videoId) async {
    final response = await _client.delete(ApiPaths.appPath('/video/${videoId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上传视频
  Future<PlusApiResultVideoVO?> createVideo(VideoCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/video'), body: body, contentType: 'application/json');
    return response is PlusApiResultVideoVO ? response : null;
  }

  /// 发布视频
  Future<PlusApiResultVoid?> publish(String videoId) async {
    final response = await _client.post(ApiPaths.appPath('/video/${videoId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消发布
  Future<PlusApiResultVoid?> unpublish(String videoId) async {
    final response = await _client.delete(ApiPaths.appPath('/video/${videoId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 点赞视频
  Future<PlusApiResultVoid?> like(String videoId) async {
    final response = await _client.post(ApiPaths.appPath('/video/${videoId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消点赞
  Future<PlusApiResultVoid?> unlike(String videoId) async {
    final response = await _client.delete(ApiPaths.appPath('/video/${videoId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏视频
  Future<PlusApiResultVoid?> favorite(String videoId) async {
    final response = await _client.post(ApiPaths.appPath('/video/${videoId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏
  Future<PlusApiResultVoid?> unfavorite(String videoId) async {
    final response = await _client.delete(ApiPaths.appPath('/video/${videoId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 记录下载
  Future<PlusApiResultVoid?> recordDownload(String videoId) async {
    final response = await _client.post(ApiPaths.appPath('/video/${videoId}/download'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建视频生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(VideoGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/video'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 视频风格转换
  Future<PlusApiResultGenerationTaskVO?> styleTransfer(VideoStyleTransferForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/video/style-transfer'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 图生视频
  Future<PlusApiResultGenerationTaskVO?> imageTo(ImageToVideoForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/video/image-to-video'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 视频延长
  Future<PlusApiResultGenerationTaskVO?> extend(VideoExtendForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/video/extend'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取视频统计
  Future<PlusApiResultVideoStatisticsVO?> getVideoStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/video/statistics'));
    return response is PlusApiResultVideoStatisticsVO ? response : null;
  }

  /// 搜索视频
  Future<PlusApiResultPageVideoVO?> searchVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/video/search'), params: params);
    return response is PlusApiResultPageVideoVO ? response : null;
  }

  /// 获取公开视频
  Future<PlusApiResultPageVideoVO?> getPublicVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/video/public'), params: params);
    return response is PlusApiResultPageVideoVO ? response : null;
  }

  /// 获取热门视频
  Future<PlusApiResultPageVideoVO?> getPopularVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/video/popular'), params: params);
    return response is PlusApiResultPageVideoVO ? response : null;
  }

  /// 获取最受喜爱视频
  Future<PlusApiResultPageVideoVO?> getMostLikedVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/video/liked'), params: params);
    return response is PlusApiResultPageVideoVO ? response : null;
  }

  /// 获取收藏视频
  Future<PlusApiResultPageVideoVO?> getFavoriteVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/video/favorites'), params: params);
    return response is PlusApiResultPageVideoVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/video/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/video/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/video/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
