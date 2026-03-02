from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ImageCreateForm, ImageEditForm, ImageGenerationForm, ImageUpdateForm, ImageUpscaleForm, ImageVariationForm, PlusApiResultGenerationTaskVO, PlusApiResultImageDetailVO, PlusApiResultImageStatisticsVO, PlusApiResultImageVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageImageVO, PlusApiResultVoid

class ImageApi:
    """image API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_image(self, imageId: str) -> PlusApiResultImageDetailVO:
        """获取图片详情"""
        return self._client.get(f"/app/v3/api/image/{imageId}")

    def update_image(self, imageId: str, body: ImageUpdateForm) -> PlusApiResultImageVO:
        """更新图片"""
        return self._client.put(f"/app/v3/api/image/{imageId}", json=body)

    def delete_image(self, imageId: str) -> PlusApiResultVoid:
        """删除图片"""
        return self._client.delete(f"/app/v3/api/image/{imageId}")

    def create_image(self, body: ImageCreateForm) -> PlusApiResultImageVO:
        """上传图片"""
        return self._client.post(f"/app/v3/api/image", json=body)

    def like(self, imageId: str) -> PlusApiResultVoid:
        """点赞图片"""
        return self._client.post(f"/app/v3/api/image/{imageId}/like")

    def unlike(self, imageId: str) -> PlusApiResultVoid:
        """取消点赞"""
        return self._client.delete(f"/app/v3/api/image/{imageId}/like")

    def favorite(self, imageId: str) -> PlusApiResultVoid:
        """收藏图片"""
        return self._client.post(f"/app/v3/api/image/{imageId}/favorite")

    def unfavorite(self, imageId: str) -> PlusApiResultVoid:
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/image/{imageId}/favorite")

    def record_download(self, imageId: str) -> PlusApiResultVoid:
        """记录下载"""
        return self._client.post(f"/app/v3/api/image/{imageId}/download")

    def create_generation(self, body: ImageGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建图片生成任务"""
        return self._client.post(f"/app/v3/api/generation/image", json=body)

    def create_variation(self, body: ImageVariationForm) -> PlusApiResultGenerationTaskVO:
        """生成变体"""
        return self._client.post(f"/app/v3/api/generation/image/variations", json=body)

    def upscale(self, body: ImageUpscaleForm) -> PlusApiResultGenerationTaskVO:
        """图片放大"""
        return self._client.post(f"/app/v3/api/generation/image/upscale", json=body)

    def edit(self, body: ImageEditForm) -> PlusApiResultGenerationTaskVO:
        """图片编辑"""
        return self._client.post(f"/app/v3/api/generation/image/edits", json=body)

    def get_image_statistics(self) -> PlusApiResultImageStatisticsVO:
        """获取图片统计"""
        return self._client.get(f"/app/v3/api/image/statistics")

    def search_images(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageImageVO:
        """搜索图片"""
        return self._client.get(f"/app/v3/api/image/search", params=params)

    def get_public_images(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageImageVO:
        """获取公开图片"""
        return self._client.get(f"/app/v3/api/image/public", params=params)

    def get_popular_images(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageImageVO:
        """获取热门图片"""
        return self._client.get(f"/app/v3/api/image/popular", params=params)

    def get_most_liked_images(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageImageVO:
        """获取最受喜爱图片"""
        return self._client.get(f"/app/v3/api/image/liked", params=params)

    def get_favorite_images(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageImageVO:
        """获取收藏图片"""
        return self._client.get(f"/app/v3/api/image/favorites", params=params)

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/image/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/image/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/image/tasks/{taskId}")
