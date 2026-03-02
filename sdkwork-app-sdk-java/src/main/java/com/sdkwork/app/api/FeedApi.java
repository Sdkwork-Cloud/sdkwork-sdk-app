package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class FeedApi {
    private final HttpClient client;
    
    public FeedApi(HttpClient client) {
        this.client = client;
    }

    /** 取消点赞Feed */
    public PlusApiResultFeedItemVO unlike(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/unlike/" + id + ""), null);
    }

    /** 取消收藏Feed */
    public PlusApiResultFeedItemVO uncollect(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/uncollect/" + id + ""), null);
    }

    /** 分享Feed */
    public PlusApiResultFeedItemVO share(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/share/" + id + ""), null);
    }

    /** 点赞Feed */
    public PlusApiResultFeedItemVO like(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/like/" + id + ""), null);
    }

    /** 收藏Feed */
    public PlusApiResultFeedItemVO collect(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/collect/" + id + ""), null, params);
    }

    /** 获取置顶Feed */
    public PlusApiResultListFeedItemVO getTopFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/top"), params);
    }

    /** 搜索Feed */
    public PlusApiResultListFeedItemVO searchFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/search"), params);
    }

    /** 获取推荐Feed */
    public PlusApiResultListFeedItemVO getRecommendedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/recommend"), params);
    }

    /** 获取最多浏览Feed */
    public PlusApiResultListFeedItemVO getMostViewedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/most-viewed"), params);
    }

    /** 获取最多点赞Feed */
    public PlusApiResultListFeedItemVO getMostLikedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/most-liked"), params);
    }

    /** 获取Feed列表 */
    public PlusApiResultListFeedItemVO getFeedList(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/list"), params);
    }

    /** 获取热门Feed */
    public PlusApiResultListFeedItemVO getHotFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/hot"), params);
    }

    /** 获取Feed详情 */
    public PlusApiResultFeedItemVO getFeedDetail(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.get(ApiPaths.appPath("/feeds/detail/" + id + ""));
    }

    /** 检查收藏状态 */
    public PlusApiResultBoolean checkCollected(String id) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/feeds/check-collected/" + id + ""));
    }

    /** 获取分类Feed */
    public PlusApiResultListFeedItemVO getFeedsByCategory(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/category/" + categoryId + ""), params);
    }
}
