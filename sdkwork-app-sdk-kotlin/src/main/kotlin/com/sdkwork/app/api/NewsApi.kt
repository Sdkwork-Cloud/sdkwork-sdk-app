package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class NewsApi(private val client: HttpClient) {

    /** 获取新闻详情 */
    suspend fun getNews(newsId: String): PlusApiResultNewsDetailVO? {
        return client.get(ApiPaths.appPath("/news/$newsId")) as? PlusApiResultNewsDetailVO
    }

    /** 更新新闻 */
    suspend fun updateNews(newsId: String, body: NewsUpdateForm): PlusApiResultNewsVO? {
        return client.put(ApiPaths.appPath("/news/$newsId"), body) as? PlusApiResultNewsVO
    }

    /** 删除新闻 */
    suspend fun deleteNews(newsId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/news/$newsId")) as? PlusApiResultVoid
    }

    /** 创建新闻 */
    suspend fun createNews(body: NewsCreateForm): PlusApiResultNewsVO? {
        return client.post(ApiPaths.appPath("/news"), body) as? PlusApiResultNewsVO
    }

    /** 搜索新闻 */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPageNewsVO? {
        return client.get(ApiPaths.appPath("/news/search"), params) as? PlusApiResultPageNewsVO
    }

    /** 获取我的新闻 */
    suspend fun getMy(params: Map<String, Any>? = null): PlusApiResultPageNewsVO? {
        return client.get(ApiPaths.appPath("/news/my"), params) as? PlusApiResultPageNewsVO
    }

    /** 获取最新新闻 */
    suspend fun getLatest(params: Map<String, Any>? = null): PlusApiResultPageNewsVO? {
        return client.get(ApiPaths.appPath("/news/latest"), params) as? PlusApiResultPageNewsVO
    }

    /** 获取分类新闻 */
    suspend fun getCategory(categoryId: String, params: Map<String, Any>? = null): PlusApiResultPageNewsVO? {
        return client.get(ApiPaths.appPath("/news/category/$categoryId"), params) as? PlusApiResultPageNewsVO
    }
}
