from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChunkRequest, FileRequest, ImageRequest, PlusApiResultFileVO, PlusApiResultListFileVO, PlusApiResultListInteger, PlusApiResultPageFileVO, PlusApiResultPresignedUrlVO, PlusApiResultStorageUsageVO, PlusApiResultUploadChunkVO, PlusApiResultUploadCredentialsVO, PlusApiResultUploadInitVO, PlusApiResultUploadPolicyVO, PlusApiResultVoid, PresignedUrlForm, UploadInitForm

class UploadApi:
    """upload API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_upload_policy(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUploadPolicyVO:
        """获取上传策略"""
        return self._client.post(f"/app/v3/api/upload/upload-policy", params=params)

    def get_upload_credentials(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUploadCredentialsVO:
        """获取上传凭证"""
        return self._client.post(f"/app/v3/api/upload/upload-credentials", params=params)

    def get_presigned_url(self, body: PresignedUrlForm) -> PlusApiResultPresignedUrlVO:
        """获取预签名URL"""
        return self._client.post(f"/app/v3/api/upload/presigned-url", json=body)

    def image(self, body: Optional[ImageRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileVO:
        """上传图片"""
        return self._client.post(f"/app/v3/api/upload/image", json=body, params=params)

    def base64image(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileVO:
        """上传Base64图片"""
        return self._client.post(f"/app/v3/api/upload/image/base64", params=params)

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFileVO:
        """获取文件列表"""
        return self._client.get(f"/app/v3/api/upload/files", params=params)

    def files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFileVO:
        """多文件上传"""
        return self._client.post(f"/app/v3/api/upload/files", params=params)

    def copy_file(self, fileId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileVO:
        """复制文件"""
        return self._client.post(f"/app/v3/api/upload/files/{fileId}/copy", params=params)

    def file(self, body: Optional[FileRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileVO:
        """单文件上传"""
        return self._client.post(f"/app/v3/api/upload/file", json=body, params=params)

    def chunk(self, body: Optional[ChunkRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUploadChunkVO:
        """上传分片"""
        return self._client.post(f"/app/v3/api/upload/chunk", json=body, params=params)

    def merge_chunks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileVO:
        """合并分片"""
        return self._client.post(f"/app/v3/api/upload/chunk/merge", params=params)

    def init_chunk(self, body: UploadInitForm) -> PlusApiResultUploadInitVO:
        """初始化分片上传"""
        return self._client.post(f"/app/v3/api/upload/chunk/init", json=body)

    def get_upload_progress(self, uploadId: str) -> PlusApiResultUploadChunkVO:
        """获取上传进度"""
        return self._client.get(f"/app/v3/api/upload/task/{uploadId}/progress")

    def get_storage_usage(self) -> PlusApiResultStorageUsageVO:
        """获取存储使用情况"""
        return self._client.get(f"/app/v3/api/upload/storage/usage")

    def get_file_presigned_url(self, fileId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPresignedUrlVO:
        """获取文件预签名URL"""
        return self._client.get(f"/app/v3/api/upload/presigned-url/{fileId}", params=params)

    def get_file_detail(self, fileId: str) -> PlusApiResultFileVO:
        """获取文件详情"""
        return self._client.get(f"/app/v3/api/upload/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultVoid:
        """删除文件"""
        return self._client.delete(f"/app/v3/api/upload/files/{fileId}")

    def get_chunk_status(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListInteger:
        """查询分片状态"""
        return self._client.get(f"/app/v3/api/upload/chunk/status", params=params)

    def cancel(self, uploadId: str) -> PlusApiResultVoid:
        """取消上传"""
        return self._client.delete(f"/app/v3/api/upload/task/{uploadId}")
