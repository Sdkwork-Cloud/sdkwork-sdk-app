package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class VideoApi {
    private final HttpClient client;
    
    public VideoApi(HttpClient client) {
        this.client = client;
    }

    /** 获取视频详情 */
    public PlusApiResultVideoDetailVO getVideo(String videoId) throws Exception {
        return (PlusApiResultVideoDetailVO) client.get(ApiPaths.appPath("/video/" + videoId + ""));
    }

    /** 更新视频 */
    public PlusApiResultVideoVO updateVideo(String videoId, VideoUpdateForm body) throws Exception {
        return (PlusApiResultVideoVO) client.put(ApiPaths.appPath("/video/" + videoId + ""), body);
    }

    /** 删除视频 */
    public PlusApiResultVoid deleteVideo(String videoId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/video/" + videoId + ""));
    }

    /** 上传视频 */
    public PlusApiResultVideoVO createVideo(VideoCreateForm body) throws Exception {
        return (PlusApiResultVideoVO) client.post(ApiPaths.appPath("/video"), body);
    }

    /** 发布视频 */
    public PlusApiResultVoid publish(String videoId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/video/" + videoId + "/publish"), null);
    }

    /** 取消发布 */
    public PlusApiResultVoid unpublish(String videoId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/video/" + videoId + "/publish"));
    }

    /** 点赞视频 */
    public PlusApiResultVoid like(String videoId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/video/" + videoId + "/like"), null);
    }

    /** 取消点赞 */
    public PlusApiResultVoid unlike(String videoId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/video/" + videoId + "/like"));
    }

    /** 收藏视频 */
    public PlusApiResultVoid favorite(String videoId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/video/" + videoId + "/favorite"), null);
    }

    /** 取消收藏 */
    public PlusApiResultVoid unfavorite(String videoId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/video/" + videoId + "/favorite"));
    }

    /** 记录下载 */
    public PlusApiResultVoid recordDownload(String videoId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/video/" + videoId + "/download"), null);
    }

    /** 创建视频生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(VideoGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/video"), body);
    }

    /** 视频风格转换 */
    public PlusApiResultGenerationTaskVO styleTransfer(VideoStyleTransferForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/video/style-transfer"), body);
    }

    /** 图生视频 */
    public PlusApiResultGenerationTaskVO imageTo(ImageToVideoForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/video/image-to-video"), body);
    }

    /** 视频延长 */
    public PlusApiResultGenerationTaskVO extend(VideoExtendForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/video/extend"), body);
    }

    /** 获取视频统计 */
    public PlusApiResultVideoStatisticsVO getVideoStatistics() throws Exception {
        return (PlusApiResultVideoStatisticsVO) client.get(ApiPaths.appPath("/video/statistics"));
    }

    /** 搜索视频 */
    public PlusApiResultPageVideoVO searchVideos(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVideoVO) client.get(ApiPaths.appPath("/video/search"), params);
    }

    /** 获取公开视频 */
    public PlusApiResultPageVideoVO getPublicVideos(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVideoVO) client.get(ApiPaths.appPath("/video/public"), params);
    }

    /** 获取热门视频 */
    public PlusApiResultPageVideoVO getPopularVideos(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVideoVO) client.get(ApiPaths.appPath("/video/popular"), params);
    }

    /** 获取最受喜爱视频 */
    public PlusApiResultPageVideoVO getMostLikedVideos(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVideoVO) client.get(ApiPaths.appPath("/video/liked"), params);
    }

    /** 获取收藏视频 */
    public PlusApiResultPageVideoVO getFavoriteVideos(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVideoVO) client.get(ApiPaths.appPath("/video/favorites"), params);
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/video/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/video/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/video/tasks/" + taskId + ""));
    }
}
