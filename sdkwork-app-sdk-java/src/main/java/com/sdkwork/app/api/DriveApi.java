package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DriveApi {
    private final HttpClient client;
    
    public DriveApi(HttpClient client) {
        this.client = client;
    }

    /** Restore drive item */
    public PlusApiResultDriveItemVO restoreItem(String itemId) throws Exception {
        return (PlusApiResultDriveItemVO) client.put(ApiPaths.appPath("/drive/items/" + itemId + "/restore"), null);
    }

    /** Rename drive item */
    public PlusApiResultDriveItemVO renameItem(String itemId, DriveRenameForm body) throws Exception {
        return (PlusApiResultDriveItemVO) client.put(ApiPaths.appPath("/drive/items/" + itemId + "/rename"), body);
    }

    /** Move drive item */
    public PlusApiResultDriveItemVO moveItem(String itemId, DriveMoveForm body) throws Exception {
        return (PlusApiResultDriveItemVO) client.put(ApiPaths.appPath("/drive/items/" + itemId + "/move"), body);
    }

    /** Get drive file content */
    public PlusApiResultDriveContentVO getItemContent(String itemId) throws Exception {
        return (PlusApiResultDriveContentVO) client.get(ApiPaths.appPath("/drive/items/" + itemId + "/content"));
    }

    /** Update drive file content */
    public PlusApiResultDriveContentVO updateItemContent(String itemId, DriveContentUpdateForm body) throws Exception {
        return (PlusApiResultDriveContentVO) client.put(ApiPaths.appPath("/drive/items/" + itemId + "/content"), body);
    }

    /** Archive drive item */
    public PlusApiResultDriveItemVO archiveItem(String itemId) throws Exception {
        return (PlusApiResultDriveItemVO) client.put(ApiPaths.appPath("/drive/items/" + itemId + "/archive"), null);
    }

    /** Favorite drive item */
    public PlusApiResultDriveItemVO favoriteItem(String itemId) throws Exception {
        return (PlusApiResultDriveItemVO) client.post(ApiPaths.appPath("/drive/items/" + itemId + "/favorite"), null);
    }

    /** Unfavorite drive item */
    public PlusApiResultDriveItemVO unfavoriteItem(String itemId) throws Exception {
        return (PlusApiResultDriveItemVO) client.delete(ApiPaths.appPath("/drive/items/" + itemId + "/favorite"));
    }

    /** Copy drive item */
    public PlusApiResultDriveItemVO copyItem(String itemId, DriveCopyForm body) throws Exception {
        return (PlusApiResultDriveItemVO) client.post(ApiPaths.appPath("/drive/items/" + itemId + "/copy"), body);
    }

    /** Batch delete drive items */
    public PlusApiResultVoid batchDeleteItems(DriveBatchDeleteForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/drive/items/batch-delete"), body);
    }

    /** Create drive folder */
    public PlusApiResultDriveItemVO createFolder(DriveFolderCreateForm body) throws Exception {
        return (PlusApiResultDriveItemVO) client.post(ApiPaths.appPath("/drive/folders"), body);
    }

    /** List drive items */
    public PlusApiResultPageDriveItemVO listItems(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageDriveItemVO) client.get(ApiPaths.appPath("/drive/items"), params);
    }

    /** Get drive item detail */
    public PlusApiResultDriveItemDetailVO getItemDetail(String itemId) throws Exception {
        return (PlusApiResultDriveItemDetailVO) client.get(ApiPaths.appPath("/drive/items/" + itemId + ""));
    }

    /** Delete drive item */
    public PlusApiResultVoid deleteItem(String itemId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/drive/items/" + itemId + ""));
    }
}
