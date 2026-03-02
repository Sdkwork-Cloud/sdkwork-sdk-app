from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ImageToVideoForm, PlusApiResultGenerationTaskVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageVideoVO, PlusApiResultVideoDetailVO, PlusApiResultVideoStatisticsVO, PlusApiResultVideoVO, PlusApiResultVoid, VideoCreateForm, VideoExtendForm, VideoGenerationForm, VideoStyleTransferForm, VideoUpdateForm

class VideoApi:
    """video API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_video(self, videoId: str) -> PlusApiResultVideoDetailVO:
        """获取视频详情"""
        return self._client.get(f"/app/v3/api/video/{videoId}")

    def update_video(self, videoId: str, body: VideoUpdateForm) -> PlusApiResultVideoVO:
        """更新视频"""
        return self._client.put(f"/app/v3/api/video/{videoId}", json=body)

    def delete_video(self, videoId: str) -> PlusApiResultVoid:
        """删除视频"""
        return self._client.delete(f"/app/v3/api/video/{videoId}")

    def create_video(self, body: VideoCreateForm) -> PlusApiResultVideoVO:
        """上传视频"""
        return self._client.post(f"/app/v3/api/video", json=body)

    def publish(self, videoId: str) -> PlusApiResultVoid:
        """发布视频"""
        return self._client.post(f"/app/v3/api/video/{videoId}/publish")

    def unpublish(self, videoId: str) -> PlusApiResultVoid:
        """取消发布"""
        return self._client.delete(f"/app/v3/api/video/{videoId}/publish")

    def like(self, videoId: str) -> PlusApiResultVoid:
        """点赞视频"""
        return self._client.post(f"/app/v3/api/video/{videoId}/like")

    def unlike(self, videoId: str) -> PlusApiResultVoid:
        """取消点赞"""
        return self._client.delete(f"/app/v3/api/video/{videoId}/like")

    def favorite(self, videoId: str) -> PlusApiResultVoid:
        """收藏视频"""
        return self._client.post(f"/app/v3/api/video/{videoId}/favorite")

    def unfavorite(self, videoId: str) -> PlusApiResultVoid:
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/video/{videoId}/favorite")

    def record_download(self, videoId: str) -> PlusApiResultVoid:
        """记录下载"""
        return self._client.post(f"/app/v3/api/video/{videoId}/download")

    def create_generation(self, body: VideoGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建视频生成任务"""
        return self._client.post(f"/app/v3/api/generation/video", json=body)

    def style_transfer(self, body: VideoStyleTransferForm) -> PlusApiResultGenerationTaskVO:
        """视频风格转换"""
        return self._client.post(f"/app/v3/api/generation/video/style-transfer", json=body)

    def image_to(self, body: ImageToVideoForm) -> PlusApiResultGenerationTaskVO:
        """图生视频"""
        return self._client.post(f"/app/v3/api/generation/video/image-to-video", json=body)

    def extend(self, body: VideoExtendForm) -> PlusApiResultGenerationTaskVO:
        """视频延长"""
        return self._client.post(f"/app/v3/api/generation/video/extend", json=body)

    def get_video_statistics(self) -> PlusApiResultVideoStatisticsVO:
        """获取视频统计"""
        return self._client.get(f"/app/v3/api/video/statistics")

    def search_videos(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVideoVO:
        """搜索视频"""
        return self._client.get(f"/app/v3/api/video/search", params=params)

    def get_public_videos(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVideoVO:
        """获取公开视频"""
        return self._client.get(f"/app/v3/api/video/public", params=params)

    def get_popular_videos(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVideoVO:
        """获取热门视频"""
        return self._client.get(f"/app/v3/api/video/popular", params=params)

    def get_most_liked_videos(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVideoVO:
        """获取最受喜爱视频"""
        return self._client.get(f"/app/v3/api/video/liked", params=params)

    def get_favorite_videos(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVideoVO:
        """获取收藏视频"""
        return self._client.get(f"/app/v3/api/video/favorites", params=params)

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/video/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/video/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/video/tasks/{taskId}")
