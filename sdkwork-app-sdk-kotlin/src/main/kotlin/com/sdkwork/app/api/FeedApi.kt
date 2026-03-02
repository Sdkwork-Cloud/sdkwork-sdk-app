package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class FeedApi(private val client: HttpClient) {

    /** 取消点赞Feed */
    suspend fun unlike(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/unlike/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** 取消收藏Feed */
    suspend fun uncollect(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/uncollect/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** 分享Feed */
    suspend fun share(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/share/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** 点赞Feed */
    suspend fun like(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/like/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** 收藏Feed */
    suspend fun collect(id: String, params: Map<String, Any>? = null): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/collect/$id"), null, params) as? PlusApiResultFeedItemVO
    }

    /** 获取置顶Feed */
    suspend fun getTopFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/top"), params) as? PlusApiResultListFeedItemVO
    }

    /** 搜索Feed */
    suspend fun searchFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/search"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取推荐Feed */
    suspend fun getRecommendedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/recommend"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取最多浏览Feed */
    suspend fun getMostViewedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/most-viewed"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取最多点赞Feed */
    suspend fun getMostLikedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/most-liked"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取Feed列表 */
    suspend fun getFeedList(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/list"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取热门Feed */
    suspend fun getHotFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/hot"), params) as? PlusApiResultListFeedItemVO
    }

    /** 获取Feed详情 */
    suspend fun getFeedDetail(id: String): PlusApiResultFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/detail/$id")) as? PlusApiResultFeedItemVO
    }

    /** 检查收藏状态 */
    suspend fun checkCollected(id: String): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/feeds/check-collected/$id")) as? PlusApiResultBoolean
    }

    /** 获取分类Feed */
    suspend fun getFeedsByCategory(categoryId: String, params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/category/$categoryId"), params) as? PlusApiResultListFeedItemVO
    }
}
