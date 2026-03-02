import Foundation

public class ProjectsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取项目详情
    public func getProjectDetail(projectId: String) async throws -> PlusApiResultProjectDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/projects/\(projectId)"))
        return response as? PlusApiResultProjectDetailVO
    }

    /// 更新项目
    public func updateProject(projectId: String, body: ProjectUpdateRequest) async throws -> PlusApiResultProjectVO? {
        let response = try await client.put(ApiPaths.appPath("/projects/\(projectId)"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 删除项目
    public func deleteProject(projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/projects/\(projectId)"))
        return response as? PlusApiResultVoid
    }

    /// 取消归档项目
    public func unarchiveProject(projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/projects/\(projectId)/unarchive"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 移动项目
    public func moveProject(projectId: String, body: ProjectMoveRequest) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/projects/\(projectId)/move"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 归档项目
    public func archiveProject(projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/projects/\(projectId)/archive"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取项目列表
    public func listProjects(params: [String: Any]? = nil) async throws -> PlusApiResultPageProjectVO? {
        let response = try await client.get(ApiPaths.appPath("/projects"), params: params)
        return response as? PlusApiResultPageProjectVO
    }

    /// 创建项目
    public func createProject(body: ProjectCreateRequest) async throws -> PlusApiResultProjectVO? {
        let response = try await client.post(ApiPaths.appPath("/projects"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 复制项目
    public func copyProject(projectId: String, body: ProjectCopyRequest) async throws -> PlusApiResultProjectVO? {
        let response = try await client.post(ApiPaths.appPath("/projects/\(projectId)/copy"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 项目统计
    public func getProjectStatistics(projectId: String) async throws -> PlusApiResultProjectStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/projects/\(projectId)/statistics"))
        return response as? PlusApiResultProjectStatisticsVO
    }

    /// 搜索项目
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageProjectVO? {
        let response = try await client.get(ApiPaths.appPath("/projects/search"), params: params)
        return response as? PlusApiResultPageProjectVO
    }

    /// 最近访问项目
    public func listRecent(params: [String: Any]? = nil) async throws -> PlusApiResultListProjectVO? {
        let response = try await client.get(ApiPaths.appPath("/projects/recent"), params: params)
        return response as? PlusApiResultListProjectVO
    }
}
