package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ImageApi {
    private final HttpClient client;
    
    public ImageApi(HttpClient client) {
        this.client = client;
    }

    /** 获取图片详情 */
    public PlusApiResultImageDetailVO getImage(String imageId) throws Exception {
        return (PlusApiResultImageDetailVO) client.get(ApiPaths.appPath("/image/" + imageId + ""));
    }

    /** 更新图片 */
    public PlusApiResultImageVO updateImage(String imageId, ImageUpdateForm body) throws Exception {
        return (PlusApiResultImageVO) client.put(ApiPaths.appPath("/image/" + imageId + ""), body);
    }

    /** 删除图片 */
    public PlusApiResultVoid deleteImage(String imageId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/image/" + imageId + ""));
    }

    /** 上传图片 */
    public PlusApiResultImageVO createImage(ImageCreateForm body) throws Exception {
        return (PlusApiResultImageVO) client.post(ApiPaths.appPath("/image"), body);
    }

    /** 点赞图片 */
    public PlusApiResultVoid like(String imageId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/image/" + imageId + "/like"), null);
    }

    /** 取消点赞 */
    public PlusApiResultVoid unlike(String imageId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/image/" + imageId + "/like"));
    }

    /** 收藏图片 */
    public PlusApiResultVoid favorite(String imageId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/image/" + imageId + "/favorite"), null);
    }

    /** 取消收藏 */
    public PlusApiResultVoid unfavorite(String imageId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/image/" + imageId + "/favorite"));
    }

    /** 记录下载 */
    public PlusApiResultVoid recordDownload(String imageId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/image/" + imageId + "/download"), null);
    }

    /** 创建图片生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(ImageGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/image"), body);
    }

    /** 生成变体 */
    public PlusApiResultGenerationTaskVO createVariation(ImageVariationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/image/variations"), body);
    }

    /** 图片放大 */
    public PlusApiResultGenerationTaskVO upscale(ImageUpscaleForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/image/upscale"), body);
    }

    /** 图片编辑 */
    public PlusApiResultGenerationTaskVO edit(ImageEditForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/image/edits"), body);
    }

    /** 获取图片统计 */
    public PlusApiResultImageStatisticsVO getImageStatistics() throws Exception {
        return (PlusApiResultImageStatisticsVO) client.get(ApiPaths.appPath("/image/statistics"));
    }

    /** 搜索图片 */
    public PlusApiResultPageImageVO searchImages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageImageVO) client.get(ApiPaths.appPath("/image/search"), params);
    }

    /** 获取公开图片 */
    public PlusApiResultPageImageVO getPublicImages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageImageVO) client.get(ApiPaths.appPath("/image/public"), params);
    }

    /** 获取热门图片 */
    public PlusApiResultPageImageVO getPopularImages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageImageVO) client.get(ApiPaths.appPath("/image/popular"), params);
    }

    /** 获取最受喜爱图片 */
    public PlusApiResultPageImageVO getMostLikedImages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageImageVO) client.get(ApiPaths.appPath("/image/liked"), params);
    }

    /** 获取收藏图片 */
    public PlusApiResultPageImageVO getFavoriteImages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageImageVO) client.get(ApiPaths.appPath("/image/favorites"), params);
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/image/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/image/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/image/tasks/" + taskId + ""));
    }
}
