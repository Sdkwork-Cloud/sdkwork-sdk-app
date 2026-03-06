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

    /** Create feed */
    public PlusApiResultFeedItemVO create(FeedCreateForm body) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds"), body);
    }

    /** Unlike feed */
    public PlusApiResultFeedItemVO unlike(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/unlike/" + id + ""), null);
    }

    /** Uncollect feed */
    public PlusApiResultFeedItemVO uncollect(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/uncollect/" + id + ""), null);
    }

    /** Share feed */
    public PlusApiResultFeedItemVO share(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/share/" + id + ""), null);
    }

    /** Like feed */
    public PlusApiResultFeedItemVO like(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/like/" + id + ""), null);
    }

    /** Collect feed */
    public PlusApiResultFeedItemVO collect(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultFeedItemVO) client.post(ApiPaths.appPath("/feeds/collect/" + id + ""), null, params);
    }

    /** Get top feeds */
    public PlusApiResultListFeedItemVO getTopFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/top"), params);
    }

    /** Search feeds */
    public PlusApiResultListFeedItemVO searchFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/search"), params);
    }

    /** Get recommended feeds */
    public PlusApiResultListFeedItemVO getRecommendedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/recommend"), params);
    }

    /** Get most viewed feeds */
    public PlusApiResultListFeedItemVO getMostViewedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/most-viewed"), params);
    }

    /** Get most liked feeds */
    public PlusApiResultListFeedItemVO getMostLikedFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/most-liked"), params);
    }

    /** Get feed list */
    public PlusApiResultListFeedItemVO getFeedList(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/list"), params);
    }

    /** Get hot feeds */
    public PlusApiResultListFeedItemVO getHotFeeds(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/hot"), params);
    }

    /** Get feed detail */
    public PlusApiResultFeedItemVO getFeedDetail(String id) throws Exception {
        return (PlusApiResultFeedItemVO) client.get(ApiPaths.appPath("/feeds/detail/" + id + ""));
    }

    /** Check collected status */
    public PlusApiResultBoolean checkCollected(String id) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/feeds/check-collected/" + id + ""));
    }

    /** Get feeds by category */
    public PlusApiResultListFeedItemVO getFeedsByCategory(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedItemVO) client.get(ApiPaths.appPath("/feeds/category/" + categoryId + ""), params);
    }

    /** Delete feed */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.appPath("/feeds/" + id + ""));
    }
}
