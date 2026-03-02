import '../http/client.dart';
import '../models.dart';

class UploadApi {
  final HttpClient _client;
  
  UploadApi(this._client);

  /// 获取上传策略
  Future<PlusApiResultUploadPolicyVO?> getUploadPolicy(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/upload-policy'), params: params);
    return response is PlusApiResultUploadPolicyVO ? response : null;
  }

  /// 获取上传凭证
  Future<PlusApiResultUploadCredentialsVO?> getUploadCredentials(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/upload-credentials'), params: params);
    return response is PlusApiResultUploadCredentialsVO ? response : null;
  }

  /// 获取预签名URL
  Future<PlusApiResultPresignedUrlVO?> getPresignedUrl(PresignedUrlForm body) async {
    final response = await _client.post(ApiPaths.appPath('/upload/presigned-url'), body: body, contentType: 'application/json');
    return response is PlusApiResultPresignedUrlVO ? response : null;
  }

  /// 上传图片
  Future<PlusApiResultFileVO?> image(ImageRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/image'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 上传Base64图片
  Future<PlusApiResultFileVO?> base64Image(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/image/base64'), params: params);
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 获取文件列表
  Future<PlusApiResultPageFileVO?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/upload/files'), params: params);
    return response is PlusApiResultPageFileVO ? response : null;
  }

  /// 多文件上传
  Future<PlusApiResultListFileVO?> files(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/files'), params: params);
    return response is PlusApiResultListFileVO ? response : null;
  }

  /// 复制文件
  Future<PlusApiResultFileVO?> copyFile(String fileId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/files/${fileId}/copy'), params: params);
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 单文件上传
  Future<PlusApiResultFileVO?> file(FileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/file'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 上传分片
  Future<PlusApiResultUploadChunkVO?> chunk(ChunkRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/chunk'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultUploadChunkVO ? response : null;
  }

  /// 合并分片
  Future<PlusApiResultFileVO?> mergeChunks(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/upload/chunk/merge'), params: params);
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 初始化分片上传
  Future<PlusApiResultUploadInitVO?> initChunk(UploadInitForm body) async {
    final response = await _client.post(ApiPaths.appPath('/upload/chunk/init'), body: body, contentType: 'application/json');
    return response is PlusApiResultUploadInitVO ? response : null;
  }

  /// 获取上传进度
  Future<PlusApiResultUploadChunkVO?> getUploadProgress(String uploadId) async {
    final response = await _client.get(ApiPaths.appPath('/upload/task/${uploadId}/progress'));
    return response is PlusApiResultUploadChunkVO ? response : null;
  }

  /// 获取存储使用情况
  Future<PlusApiResultStorageUsageVO?> getStorageUsage() async {
    final response = await _client.get(ApiPaths.appPath('/upload/storage/usage'));
    return response is PlusApiResultStorageUsageVO ? response : null;
  }

  /// 获取文件预签名URL
  Future<PlusApiResultPresignedUrlVO?> getFilePresignedUrl(String fileId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/upload/presigned-url/${fileId}'), params: params);
    return response is PlusApiResultPresignedUrlVO ? response : null;
  }

  /// 获取文件详情
  Future<PlusApiResultFileVO?> getFileDetail(String fileId) async {
    final response = await _client.get(ApiPaths.appPath('/upload/files/${fileId}'));
    return response is PlusApiResultFileVO ? response : null;
  }

  /// 删除文件
  Future<PlusApiResultVoid?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.appPath('/upload/files/${fileId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 查询分片状态
  Future<PlusApiResultListInteger?> getChunkStatus(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/upload/chunk/status'), params: params);
    return response is PlusApiResultListInteger ? response : null;
  }

  /// 取消上传
  Future<PlusApiResultVoid?> cancel(String uploadId) async {
    final response = await _client.delete(ApiPaths.appPath('/upload/task/${uploadId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
