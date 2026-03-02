package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class FavoriteApi {
    private final HttpClient client;
    
    public FavoriteApi(HttpClient client) {
        this.client = client;
    }

    /** 移动收藏 */
    public PlusApiResultFavoriteVO moveFavoriteToFolder(String favoriteId, FavoriteMoveForm body) throws Exception {
        return (PlusApiResultFavoriteVO) client.put(ApiPaths.appPath("/favorite/" + favoriteId + "/move"), body);
    }

    /** 更新收藏夹 */
    public PlusApiResultFavoriteFolderVO updateFavoriteFolder(String folderId, FavoriteFolderUpdateForm body) throws Exception {
        return (PlusApiResultFavoriteFolderVO) client.put(ApiPaths.appPath("/favorite/folders/" + folderId + ""), body);
    }

    /** 删除收藏夹 */
    public PlusApiResultVoid deleteFavoriteFolder(String folderId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/favorite/folders/" + folderId + ""), params);
    }

    /** 批量移动收藏 */
    public PlusApiResultVoid batchMoveFavorites(FavoriteBatchMoveForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/favorite/batch/move"), body);
    }

    /** 收藏列表 */
    public PlusApiResultPageFavoriteItemVO listFavorites(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFavoriteItemVO) client.get(ApiPaths.appPath("/favorite"), params);
    }

    /** 添加收藏 */
    public PlusApiResultFavoriteVO add(FavoriteAddForm body) throws Exception {
        return (PlusApiResultFavoriteVO) client.post(ApiPaths.appPath("/favorite"), body);
    }

    /** 收藏夹列表 */
    public PlusApiResultListFavoriteFolderVO listFavoriteFolders() throws Exception {
        return (PlusApiResultListFavoriteFolderVO) client.get(ApiPaths.appPath("/favorite/folders"));
    }

    /** 创建收藏夹 */
    public PlusApiResultFavoriteFolderVO createFavoriteFolder(FavoriteFolderCreateForm body) throws Exception {
        return (PlusApiResultFavoriteFolderVO) client.post(ApiPaths.appPath("/favorite/folders"), body);
    }

    /** 批量检查收藏 */
    public PlusApiResultListFavoriteCheckVO batchCheckFavorites(FavoriteBatchCheckForm body) throws Exception {
        return (PlusApiResultListFavoriteCheckVO) client.post(ApiPaths.appPath("/favorite/batch-check"), body);
    }

    /** 收藏详情 */
    public PlusApiResultFavoriteDetailVO getFavoriteDetail(String favoriteId) throws Exception {
        return (PlusApiResultFavoriteDetailVO) client.get(ApiPaths.appPath("/favorite/" + favoriteId + ""));
    }

    /** 取消收藏 */
    public PlusApiResultVoid remove(String favoriteId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/favorite/" + favoriteId + ""));
    }

    /** 收藏统计 */
    public PlusApiResultFavoriteStatisticsVO getFavoriteStatistics() throws Exception {
        return (PlusApiResultFavoriteStatisticsVO) client.get(ApiPaths.appPath("/favorite/statistics"));
    }

    /** 最近收藏 */
    public PlusApiResultListFavoriteItemVO getRecentFavorites(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFavoriteItemVO) client.get(ApiPaths.appPath("/favorite/recent"), params);
    }

    /** 各类型收藏数 */
    public PlusApiResultListFavoriteTypeCountVO getFavoriteCountByType() throws Exception {
        return (PlusApiResultListFavoriteTypeCountVO) client.get(ApiPaths.appPath("/favorite/count/by-type"));
    }

    /** 检查收藏状态 */
    public PlusApiResultFavoriteCheckVO check(Map<String, Object> params) throws Exception {
        return (PlusApiResultFavoriteCheckVO) client.get(ApiPaths.appPath("/favorite/check"), params);
    }

    /** 按目标取消收藏 */
    public PlusApiResultVoid removeFavoriteByTarget(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/favorite/by-target"), params);
    }

    /** 批量取消收藏 */
    public PlusApiResultVoid batchRemoveFavorites() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/favorite/batch"));
    }
}
