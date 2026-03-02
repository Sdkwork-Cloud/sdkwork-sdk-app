import Foundation

public class FileSystemApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Rename node
    public func renameNode(nodeId: String, body: FileSystemRenameForm) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.put(ApiPaths.appPath("/filesystem/nodes/\(nodeId)/rename"), body: body)
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// Move node
    public func moveNode(nodeId: String, body: FileSystemMoveForm) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.put(ApiPaths.appPath("/filesystem/nodes/\(nodeId)/move"), body: body)
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// Get file content
    public func getFileContent(fileId: String) async throws -> PlusApiResultFileSystemContentVO? {
        let response = try await client.get(ApiPaths.appPath("/filesystem/files/\(fileId)/content"))
        return response as? PlusApiResultFileSystemContentVO
    }

    /// Update file content
    public func updateFileContent(fileId: String, body: FileSystemContentUpdateForm) async throws -> PlusApiResultFileSystemContentVO? {
        let response = try await client.put(ApiPaths.appPath("/filesystem/files/\(fileId)/content"), body: body)
        return response as? PlusApiResultFileSystemContentVO
    }

    /// Copy node
    public func copyNode(nodeId: String, body: FileSystemCopyForm) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.post(ApiPaths.appPath("/filesystem/nodes/\(nodeId)/copy"), body: body)
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// Create folder
    public func createFolder(body: FileSystemFolderCreateForm) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.post(ApiPaths.appPath("/filesystem/folders"), body: body)
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// Create file
    public func createFile(body: FileSystemFileCreateForm) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.post(ApiPaths.appPath("/filesystem/files"), body: body)
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// List nodes
    public func listNodes(params: [String: Any]? = nil) async throws -> PlusApiResultPageFileSystemNodeVO? {
        let response = try await client.get(ApiPaths.appPath("/filesystem/nodes"), params: params)
        return response as? PlusApiResultPageFileSystemNodeVO
    }

    /// Get node detail
    public func getNodeDetail(nodeId: String) async throws -> PlusApiResultFileSystemNodeVO? {
        let response = try await client.get(ApiPaths.appPath("/filesystem/nodes/\(nodeId)"))
        return response as? PlusApiResultFileSystemNodeVO
    }

    /// Delete node
    public func deleteNode(nodeId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/filesystem/nodes/\(nodeId)"))
        return response as? PlusApiResultVoid
    }

    /// List disks
    public func listDisks() async throws -> PlusApiResultListFileSystemDiskVO? {
        let response = try await client.get(ApiPaths.appPath("/filesystem/disks"))
        return response as? PlusApiResultListFileSystemDiskVO
    }

    /// Get primary disk
    public func getPrimaryDisk() async throws -> PlusApiResultFileSystemDiskVO? {
        let response = try await client.get(ApiPaths.appPath("/filesystem/disks/default"))
        return response as? PlusApiResultFileSystemDiskVO
    }
}
