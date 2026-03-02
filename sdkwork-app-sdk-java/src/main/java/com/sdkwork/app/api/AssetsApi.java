package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AssetsApi {
    private final HttpClient client;
    
    public AssetsApi(HttpClient client) {
        this.client = client;
    }

    /** 重命名资产 */
    public PlusApiResultVoid renameAsset(String assetId, AssetRenameForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/assets/" + assetId + "/rename"), body);
    }

    /** 移动资产 */
    public PlusApiResultVoid moveAsset(String assetId, AssetMoveForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/assets/" + assetId + "/move"), body);
    }

    /** 收藏资产 */
    public PlusApiResultVoid favoriteAsset(String assetId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/assets/" + assetId + "/favorite"), null);
    }

    /** 取消收藏 */
    public PlusApiResultVoid unfavoriteAsset(String assetId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/assets/" + assetId + "/favorite"));
    }

    /** 获取文件夹列表 */
    public PlusApiResultListFolderVO listFolders() throws Exception {
        return (PlusApiResultListFolderVO) client.get(ApiPaths.appPath("/assets/folders"));
    }

    /** 创建文件夹 */
    public PlusApiResultFolderVO createFolder(FolderCreateForm body) throws Exception {
        return (PlusApiResultFolderVO) client.post(ApiPaths.appPath("/assets/folders"), body);
    }

    /** 获取资产列表 */
    public PlusApiResultPageAssetVO listAssets(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAssetVO) client.get(ApiPaths.appPath("/assets"), params);
    }

    /** 获取资产详情 */
    public PlusApiResultAssetDetailVO getAssetDetail(String assetId) throws Exception {
        return (PlusApiResultAssetDetailVO) client.get(ApiPaths.appPath("/assets/" + assetId + ""));
    }

    /** 删除资产 */
    public PlusApiResultVoid deleteAsset(String assetId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/assets/" + assetId + ""));
    }

    /** 下载资产 */
    public PlusApiResultDownloadUrlVO getDownloadUrl(String assetId, Map<String, Object> params) throws Exception {
        return (PlusApiResultDownloadUrlVO) client.get(ApiPaths.appPath("/assets/" + assetId + "/download"), params);
    }

    /** 获取资产统计 */
    public PlusApiResultAssetStatisticsVO getStatistics() throws Exception {
        return (PlusApiResultAssetStatisticsVO) client.get(ApiPaths.appPath("/assets/statistics"));
    }

    /** 删除文件夹 */
    public PlusApiResultVoid deleteFolder(String folderId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/assets/folders/" + folderId + ""));
    }

    /** 批量删除资产 */
    public PlusApiResultVoid batchDelete() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/assets/batch"));
    }
}
