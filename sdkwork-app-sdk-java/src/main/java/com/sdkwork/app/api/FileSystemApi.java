package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class FileSystemApi {
    private final HttpClient client;
    
    public FileSystemApi(HttpClient client) {
        this.client = client;
    }

    /** Rename node */
    public PlusApiResultFileSystemNodeVO renameNode(String nodeId, FileSystemRenameForm body) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.put(ApiPaths.appPath("/filesystem/nodes/" + nodeId + "/rename"), body);
    }

    /** Move node */
    public PlusApiResultFileSystemNodeVO moveNode(String nodeId, FileSystemMoveForm body) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.put(ApiPaths.appPath("/filesystem/nodes/" + nodeId + "/move"), body);
    }

    /** Get file content */
    public PlusApiResultFileSystemContentVO getFileContent(String fileId) throws Exception {
        return (PlusApiResultFileSystemContentVO) client.get(ApiPaths.appPath("/filesystem/files/" + fileId + "/content"));
    }

    /** Update file content */
    public PlusApiResultFileSystemContentVO updateFileContent(String fileId, FileSystemContentUpdateForm body) throws Exception {
        return (PlusApiResultFileSystemContentVO) client.put(ApiPaths.appPath("/filesystem/files/" + fileId + "/content"), body);
    }

    /** Copy node */
    public PlusApiResultFileSystemNodeVO copyNode(String nodeId, FileSystemCopyForm body) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.post(ApiPaths.appPath("/filesystem/nodes/" + nodeId + "/copy"), body);
    }

    /** Create folder */
    public PlusApiResultFileSystemNodeVO createFolder(FileSystemFolderCreateForm body) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.post(ApiPaths.appPath("/filesystem/folders"), body);
    }

    /** Create file */
    public PlusApiResultFileSystemNodeVO createFile(FileSystemFileCreateForm body) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.post(ApiPaths.appPath("/filesystem/files"), body);
    }

    /** List nodes */
    public PlusApiResultPageFileSystemNodeVO listNodes(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFileSystemNodeVO) client.get(ApiPaths.appPath("/filesystem/nodes"), params);
    }

    /** Get node detail */
    public PlusApiResultFileSystemNodeVO getNodeDetail(String nodeId) throws Exception {
        return (PlusApiResultFileSystemNodeVO) client.get(ApiPaths.appPath("/filesystem/nodes/" + nodeId + ""));
    }

    /** Delete node */
    public PlusApiResultVoid deleteNode(String nodeId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/filesystem/nodes/" + nodeId + ""));
    }

    /** List disks */
    public PlusApiResultListFileSystemDiskVO listDisks() throws Exception {
        return (PlusApiResultListFileSystemDiskVO) client.get(ApiPaths.appPath("/filesystem/disks"));
    }

    /** Get primary disk */
    public PlusApiResultFileSystemDiskVO getPrimaryDisk() throws Exception {
        return (PlusApiResultFileSystemDiskVO) client.get(ApiPaths.appPath("/filesystem/disks/default"));
    }
}
