package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class NewsApi {
    private final HttpClient client;
    
    public NewsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取新闻详情 */
    public PlusApiResultNewsDetailVO getNews(String newsId) throws Exception {
        return (PlusApiResultNewsDetailVO) client.get(ApiPaths.appPath("/news/" + newsId + ""));
    }

    /** 更新新闻 */
    public PlusApiResultNewsVO updateNews(String newsId, NewsUpdateForm body) throws Exception {
        return (PlusApiResultNewsVO) client.put(ApiPaths.appPath("/news/" + newsId + ""), body);
    }

    /** 删除新闻 */
    public PlusApiResultVoid deleteNews(String newsId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/news/" + newsId + ""));
    }

    /** 创建新闻 */
    public PlusApiResultNewsVO createNews(NewsCreateForm body) throws Exception {
        return (PlusApiResultNewsVO) client.post(ApiPaths.appPath("/news"), body);
    }

    /** 搜索新闻 */
    public PlusApiResultPageNewsVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNewsVO) client.get(ApiPaths.appPath("/news/search"), params);
    }

    /** 获取我的新闻 */
    public PlusApiResultPageNewsVO getMy(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNewsVO) client.get(ApiPaths.appPath("/news/my"), params);
    }

    /** 获取最新新闻 */
    public PlusApiResultPageNewsVO getLatest(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNewsVO) client.get(ApiPaths.appPath("/news/latest"), params);
    }

    /** 获取分类新闻 */
    public PlusApiResultPageNewsVO getCategory(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNewsVO) client.get(ApiPaths.appPath("/news/category/" + categoryId + ""), params);
    }
}
