package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class FeedApi(private val client: HttpClient) {

    /** Create feed */
    suspend fun create(body: FeedCreateForm): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds"), body) as? PlusApiResultFeedItemVO
    }

    /** Unlike feed */
    suspend fun unlike(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/unlike/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** Uncollect feed */
    suspend fun uncollect(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/uncollect/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** Share feed */
    suspend fun share(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/share/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** Like feed */
    suspend fun like(id: String): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/like/$id"), null) as? PlusApiResultFeedItemVO
    }

    /** Collect feed */
    suspend fun collect(id: String, params: Map<String, Any>? = null): PlusApiResultFeedItemVO? {
        return client.post(ApiPaths.appPath("/feeds/collect/$id"), null, params) as? PlusApiResultFeedItemVO
    }

    /** Get top feeds */
    suspend fun getTopFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/top"), params) as? PlusApiResultListFeedItemVO
    }

    /** Search feeds */
    suspend fun searchFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/search"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get recommended feeds */
    suspend fun getRecommendedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/recommend"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get most viewed feeds */
    suspend fun getMostViewedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/most-viewed"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get most liked feeds */
    suspend fun getMostLikedFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/most-liked"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get feed list */
    suspend fun getFeedList(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/list"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get hot feeds */
    suspend fun getHotFeeds(params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/hot"), params) as? PlusApiResultListFeedItemVO
    }

    /** Get feed detail */
    suspend fun getFeedDetail(id: String): PlusApiResultFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/detail/$id")) as? PlusApiResultFeedItemVO
    }

    /** Check collected status */
    suspend fun checkCollected(id: String): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/feeds/check-collected/$id")) as? PlusApiResultBoolean
    }

    /** Get feeds by category */
    suspend fun getFeedsByCategory(categoryId: String, params: Map<String, Any>? = null): PlusApiResultListFeedItemVO? {
        return client.get(ApiPaths.appPath("/feeds/category/$categoryId"), params) as? PlusApiResultListFeedItemVO
    }

    /** Delete feed */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.appPath("/feeds/$id")) as? PlusApiResultBoolean
    }
}
