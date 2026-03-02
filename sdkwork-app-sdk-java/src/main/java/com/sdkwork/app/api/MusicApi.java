package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class MusicApi {
    private final HttpClient client;
    
    public MusicApi(HttpClient client) {
        this.client = client;
    }

    /** 获取音乐详情 */
    public PlusApiResultMusicDetailVO getMusic(String musicId) throws Exception {
        return (PlusApiResultMusicDetailVO) client.get(ApiPaths.appPath("/music/" + musicId + ""));
    }

    /** 更新音乐 */
    public PlusApiResultMusicVO updateMusic(String musicId, MusicUpdateForm body) throws Exception {
        return (PlusApiResultMusicVO) client.put(ApiPaths.appPath("/music/" + musicId + ""), body);
    }

    /** 删除音乐 */
    public PlusApiResultVoid deleteMusic(String musicId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/music/" + musicId + ""));
    }

    /** 上传音乐 */
    public PlusApiResultMusicVO createMusic(MusicCreateForm body) throws Exception {
        return (PlusApiResultMusicVO) client.post(ApiPaths.appPath("/music"), body);
    }

    /** 发布音乐 */
    public PlusApiResultVoid publish(String musicId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/music/" + musicId + "/publish"), null);
    }

    /** 取消发布 */
    public PlusApiResultVoid unpublish(String musicId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/music/" + musicId + "/publish"));
    }

    /** 点赞音乐 */
    public PlusApiResultVoid like(String musicId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/music/" + musicId + "/like"), null);
    }

    /** 取消点赞 */
    public PlusApiResultVoid unlike(String musicId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/music/" + musicId + "/like"));
    }

    /** 收藏音乐 */
    public PlusApiResultVoid favorite(String musicId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/music/" + musicId + "/favorite"), null);
    }

    /** 取消收藏 */
    public PlusApiResultVoid unfavorite(String musicId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/music/" + musicId + "/favorite"));
    }

    /** 记录下载 */
    public PlusApiResultVoid recordDownload(String musicId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/music/" + musicId + "/download"), null);
    }

    /** 创建音乐生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(MusicGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/music"), body);
    }

    /** 相似音乐生成 */
    public PlusApiResultGenerationTaskVO generateSimilar(MusicSimilarForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/music/similar"), body);
    }

    /** 音乐混音 */
    public PlusApiResultGenerationTaskVO remix(MusicRemixForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/music/remix"), body);
    }

    /** 音乐续写 */
    public PlusApiResultGenerationTaskVO extend(MusicExtendForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/music/extend"), body);
    }

    /** 获取音乐统计 */
    public PlusApiResultMusicStatisticsVO getMusicStatistics() throws Exception {
        return (PlusApiResultMusicStatisticsVO) client.get(ApiPaths.appPath("/music/statistics"));
    }

    /** 搜索音乐 */
    public PlusApiResultPageMusicVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMusicVO) client.get(ApiPaths.appPath("/music/search"), params);
    }

    /** 获取公开音乐 */
    public PlusApiResultPageMusicVO getPublic(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMusicVO) client.get(ApiPaths.appPath("/music/public"), params);
    }

    /** 获取热门音乐 */
    public PlusApiResultPageMusicVO getPopular(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMusicVO) client.get(ApiPaths.appPath("/music/popular"), params);
    }

    /** 获取最受喜爱音乐 */
    public PlusApiResultPageMusicVO getMostLiked(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMusicVO) client.get(ApiPaths.appPath("/music/liked"), params);
    }

    /** 获取收藏音乐 */
    public PlusApiResultPageMusicVO getFavorite(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMusicVO) client.get(ApiPaths.appPath("/music/favorites"), params);
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/music/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/music/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/music/tasks/" + taskId + ""));
    }

    /** 获取音乐风格列表 */
    public PlusApiResultMusicStylesVO getMusicStyles(Map<String, Object> params) throws Exception {
        return (PlusApiResultMusicStylesVO) client.get(ApiPaths.appPath("/generation/music/styles"), params);
    }
}
