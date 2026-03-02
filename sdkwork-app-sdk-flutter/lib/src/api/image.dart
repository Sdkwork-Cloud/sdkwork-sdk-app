import '../http/client.dart';
import '../models.dart';

class ImageApi {
  final HttpClient _client;
  
  ImageApi(this._client);

  /// 获取图片详情
  Future<PlusApiResultImageDetailVO?> getImage(String imageId) async {
    final response = await _client.get(ApiPaths.appPath('/image/${imageId}'));
    return response is PlusApiResultImageDetailVO ? response : null;
  }

  /// 更新图片
  Future<PlusApiResultImageVO?> updateImage(String imageId, ImageUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/image/${imageId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultImageVO ? response : null;
  }

  /// 删除图片
  Future<PlusApiResultVoid?> deleteImage(String imageId) async {
    final response = await _client.delete(ApiPaths.appPath('/image/${imageId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上传图片
  Future<PlusApiResultImageVO?> createImage(ImageCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/image'), body: body, contentType: 'application/json');
    return response is PlusApiResultImageVO ? response : null;
  }

  /// 点赞图片
  Future<PlusApiResultVoid?> like(String imageId) async {
    final response = await _client.post(ApiPaths.appPath('/image/${imageId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消点赞
  Future<PlusApiResultVoid?> unlike(String imageId) async {
    final response = await _client.delete(ApiPaths.appPath('/image/${imageId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏图片
  Future<PlusApiResultVoid?> favorite(String imageId) async {
    final response = await _client.post(ApiPaths.appPath('/image/${imageId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏
  Future<PlusApiResultVoid?> unfavorite(String imageId) async {
    final response = await _client.delete(ApiPaths.appPath('/image/${imageId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 记录下载
  Future<PlusApiResultVoid?> recordDownload(String imageId) async {
    final response = await _client.post(ApiPaths.appPath('/image/${imageId}/download'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建图片生成任务
  Future<PlusApiResultGenerationTaskVO?> createGeneration(ImageGenerationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/image'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 生成变体
  Future<PlusApiResultGenerationTaskVO?> createVariation(ImageVariationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/image/variations'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 图片放大
  Future<PlusApiResultGenerationTaskVO?> upscale(ImageUpscaleForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/image/upscale'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 图片编辑
  Future<PlusApiResultGenerationTaskVO?> edit(ImageEditForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/image/edits'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 获取图片统计
  Future<PlusApiResultImageStatisticsVO?> getImageStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/image/statistics'));
    return response is PlusApiResultImageStatisticsVO ? response : null;
  }

  /// 搜索图片
  Future<PlusApiResultPageImageVO?> searchImages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/image/search'), params: params);
    return response is PlusApiResultPageImageVO ? response : null;
  }

  /// 获取公开图片
  Future<PlusApiResultPageImageVO?> getPublicImages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/image/public'), params: params);
    return response is PlusApiResultPageImageVO ? response : null;
  }

  /// 获取热门图片
  Future<PlusApiResultPageImageVO?> getPopularImages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/image/popular'), params: params);
    return response is PlusApiResultPageImageVO ? response : null;
  }

  /// 获取最受喜爱图片
  Future<PlusApiResultPageImageVO?> getMostLikedImages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/image/liked'), params: params);
    return response is PlusApiResultPageImageVO ? response : null;
  }

  /// 获取收藏图片
  Future<PlusApiResultPageImageVO?> getFavoriteImages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/image/favorites'), params: params);
    return response is PlusApiResultPageImageVO ? response : null;
  }

  /// 获取任务列表
  Future<PlusApiResultPageGenerationTaskVO?> listTasks(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/image/tasks'), params: params);
    return response is PlusApiResultPageGenerationTaskVO ? response : null;
  }

  /// 获取任务状态
  Future<PlusApiResultGenerationTaskVO?> getTaskStatus(String taskId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/image/tasks/${taskId}'));
    return response is PlusApiResultGenerationTaskVO ? response : null;
  }

  /// 取消任务
  Future<PlusApiResultVoid?> cancelTask(String taskId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/image/tasks/${taskId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
