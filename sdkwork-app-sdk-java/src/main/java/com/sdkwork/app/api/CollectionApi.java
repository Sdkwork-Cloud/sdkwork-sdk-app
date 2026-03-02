package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CollectionApi {
    private final HttpClient client;
    
    public CollectionApi(HttpClient client) {
        this.client = client;
    }

    /** 获取合集详情 */
    public PlusApiResultCollectionDetailVO getCollection(String collectionId) throws Exception {
        return (PlusApiResultCollectionDetailVO) client.get(ApiPaths.appPath("/collection/" + collectionId + ""));
    }

    /** 更新合集 */
    public PlusApiResultCollectionVO updateCollection(String collectionId, CollectionUpdateForm body) throws Exception {
        return (PlusApiResultCollectionVO) client.put(ApiPaths.appPath("/collection/" + collectionId + ""), body);
    }

    /** 删除合集 */
    public PlusApiResultVoid deleteCollection(String collectionId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/collection/" + collectionId + ""));
    }

    /** 更新内容排序 */
    public PlusApiResultVoid updateItemPositions(String collectionId, CollectionItemPositionForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/collection/" + collectionId + "/items/positions"), body);
    }

    /** 创建合集 */
    public PlusApiResultCollectionVO createCollection(CollectionCreateForm body) throws Exception {
        return (PlusApiResultCollectionVO) client.post(ApiPaths.appPath("/collection"), body);
    }

    /** 获取合集内容列表 */
    public PlusApiResultListCollectionItemVO getCollectionItems(String collectionId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListCollectionItemVO) client.get(ApiPaths.appPath("/collection/" + collectionId + "/items"), params);
    }

    /** 添加内容到合集 */
    public PlusApiResultCollectionItemVO addItem(String collectionId, CollectionItemAddForm body) throws Exception {
        return (PlusApiResultCollectionItemVO) client.post(ApiPaths.appPath("/collection/" + collectionId + "/items"), body);
    }

    /** 置顶内容 */
    public PlusApiResultVoid pinItem(String collectionId, String itemId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/collection/" + collectionId + "/items/" + itemId + "/pin"), null);
    }

    /** 取消置顶 */
    public PlusApiResultVoid unpinItem(String collectionId, String itemId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/collection/" + collectionId + "/items/" + itemId + "/pin"));
    }

    /** 获取合集路径 */
    public PlusApiResultListCollectionVO getCollectionPath(String collectionId) throws Exception {
        return (PlusApiResultListCollectionVO) client.get(ApiPaths.appPath("/collection/" + collectionId + "/path"));
    }

    /** 获取合集树 */
    public PlusApiResultListCollectionTreeVO getCollectionTree(Map<String, Object> params) throws Exception {
        return (PlusApiResultListCollectionTreeVO) client.get(ApiPaths.appPath("/collection/tree"), params);
    }

    /** 搜索合集 */
    public PlusApiResultPageCollectionVO searchCollections(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCollectionVO) client.get(ApiPaths.appPath("/collection/search"), params);
    }

    /** 获取我的合集 */
    public PlusApiResultPageCollectionVO getMyCollections(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCollectionVO) client.get(ApiPaths.appPath("/collection/my"), params);
    }

    /** 从合集移除内容 */
    public PlusApiResultVoid removeItem(String collectionId, String contentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/collection/" + collectionId + "/items/" + contentId + ""));
    }
}
