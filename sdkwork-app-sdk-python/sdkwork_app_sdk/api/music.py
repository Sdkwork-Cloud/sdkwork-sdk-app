from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import MusicCreateForm, MusicExtendForm, MusicGenerationForm, MusicRemixForm, MusicSimilarForm, MusicUpdateForm, PlusApiResultGenerationTaskVO, PlusApiResultMusicDetailVO, PlusApiResultMusicStatisticsVO, PlusApiResultMusicStylesVO, PlusApiResultMusicVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageMusicVO, PlusApiResultVoid

class MusicApi:
    """music API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_music(self, musicId: str) -> PlusApiResultMusicDetailVO:
        """获取音乐详情"""
        return self._client.get(f"/app/v3/api/music/{musicId}")

    def update_music(self, musicId: str, body: MusicUpdateForm) -> PlusApiResultMusicVO:
        """更新音乐"""
        return self._client.put(f"/app/v3/api/music/{musicId}", json=body)

    def delete_music(self, musicId: str) -> PlusApiResultVoid:
        """删除音乐"""
        return self._client.delete(f"/app/v3/api/music/{musicId}")

    def create_music(self, body: MusicCreateForm) -> PlusApiResultMusicVO:
        """上传音乐"""
        return self._client.post(f"/app/v3/api/music", json=body)

    def publish(self, musicId: str) -> PlusApiResultVoid:
        """发布音乐"""
        return self._client.post(f"/app/v3/api/music/{musicId}/publish")

    def unpublish(self, musicId: str) -> PlusApiResultVoid:
        """取消发布"""
        return self._client.delete(f"/app/v3/api/music/{musicId}/publish")

    def like(self, musicId: str) -> PlusApiResultVoid:
        """点赞音乐"""
        return self._client.post(f"/app/v3/api/music/{musicId}/like")

    def unlike(self, musicId: str) -> PlusApiResultVoid:
        """取消点赞"""
        return self._client.delete(f"/app/v3/api/music/{musicId}/like")

    def favorite(self, musicId: str) -> PlusApiResultVoid:
        """收藏音乐"""
        return self._client.post(f"/app/v3/api/music/{musicId}/favorite")

    def unfavorite(self, musicId: str) -> PlusApiResultVoid:
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/music/{musicId}/favorite")

    def record_download(self, musicId: str) -> PlusApiResultVoid:
        """记录下载"""
        return self._client.post(f"/app/v3/api/music/{musicId}/download")

    def create_generation(self, body: MusicGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建音乐生成任务"""
        return self._client.post(f"/app/v3/api/generation/music", json=body)

    def generate_similar(self, body: MusicSimilarForm) -> PlusApiResultGenerationTaskVO:
        """相似音乐生成"""
        return self._client.post(f"/app/v3/api/generation/music/similar", json=body)

    def remix(self, body: MusicRemixForm) -> PlusApiResultGenerationTaskVO:
        """音乐混音"""
        return self._client.post(f"/app/v3/api/generation/music/remix", json=body)

    def extend(self, body: MusicExtendForm) -> PlusApiResultGenerationTaskVO:
        """音乐续写"""
        return self._client.post(f"/app/v3/api/generation/music/extend", json=body)

    def get_music_statistics(self) -> PlusApiResultMusicStatisticsVO:
        """获取音乐统计"""
        return self._client.get(f"/app/v3/api/music/statistics")

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMusicVO:
        """搜索音乐"""
        return self._client.get(f"/app/v3/api/music/search", params=params)

    def get_public(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMusicVO:
        """获取公开音乐"""
        return self._client.get(f"/app/v3/api/music/public", params=params)

    def get_popular(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMusicVO:
        """获取热门音乐"""
        return self._client.get(f"/app/v3/api/music/popular", params=params)

    def get_most_liked(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMusicVO:
        """获取最受喜爱音乐"""
        return self._client.get(f"/app/v3/api/music/liked", params=params)

    def get_favorite(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMusicVO:
        """获取收藏音乐"""
        return self._client.get(f"/app/v3/api/music/favorites", params=params)

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/music/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/music/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/music/tasks/{taskId}")

    def get_music_styles(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultMusicStylesVO:
        """获取音乐风格列表"""
        return self._client.get(f"/app/v3/api/generation/music/styles", params=params)
