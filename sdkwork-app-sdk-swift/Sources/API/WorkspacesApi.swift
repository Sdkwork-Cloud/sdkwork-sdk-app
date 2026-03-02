import Foundation

public class WorkspacesApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取工作空间详情
    public func getWorkspaceDetail(workspaceId: String) async throws -> PlusApiResultWorkspaceVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces/\(workspaceId)"))
        return response as? PlusApiResultWorkspaceVO
    }

    /// 更新工作空间
    public func updateWorkspace(workspaceId: String, body: WorkspaceUpdateForm) async throws -> PlusApiResultWorkspaceVO? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)"), body: body)
        return response as? PlusApiResultWorkspaceVO
    }

    /// 删除工作空间
    public func deleteWorkspace(workspaceId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/workspaces/\(workspaceId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取项目详情
    public func getProjectDetail(workspaceId: String, projectId: String) async throws -> PlusApiResultProjectDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)"))
        return response as? PlusApiResultProjectDetailVO
    }

    /// 更新项目
    public func updateProject(workspaceId: String, projectId: String, body: ProjectUpdateForm) async throws -> PlusApiResultProjectVO? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 删除项目
    public func deleteProject(workspaceId: String, projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)"))
        return response as? PlusApiResultVoid
    }

    /// 取消归档项目
    public func unarchiveProject(workspaceId: String, projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)/unarchive"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 移动项目
    public func moveProject(workspaceId: String, projectId: String, body: ProjectMoveForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)/move"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 归档项目
    public func archiveProject(workspaceId: String, projectId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)/archive"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 更新成员角色
    public func updateMemberRole(workspaceId: String, userId: String, body: MemberRoleUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/workspaces/\(workspaceId)/members/\(userId)/role"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取工作空间列表
    public func listWorkspaces() async throws -> PlusApiResultListWorkspaceVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces"))
        return response as? PlusApiResultListWorkspaceVO
    }

    /// 创建工作空间
    public func createWorkspace(body: WorkspaceCreateForm) async throws -> PlusApiResultWorkspaceVO? {
        let response = try await client.post(ApiPaths.appPath("/workspaces"), body: body)
        return response as? PlusApiResultWorkspaceVO
    }

    /// 获取项目列表
    public func listProjects(workspaceId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageProjectVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces/\(workspaceId)/projects"), params: params)
        return response as? PlusApiResultPageProjectVO
    }

    /// 创建项目
    public func createProject(workspaceId: String, body: ProjectCreateForm) async throws -> PlusApiResultProjectVO? {
        let response = try await client.post(ApiPaths.appPath("/workspaces/\(workspaceId)/projects"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 复制项目
    public func copyProject(workspaceId: String, projectId: String, body: ProjectCopyForm) async throws -> PlusApiResultProjectVO? {
        let response = try await client.post(ApiPaths.appPath("/workspaces/\(workspaceId)/projects/\(projectId)/copy"), body: body)
        return response as? PlusApiResultProjectVO
    }

    /// 获取工作空间成员
    public func listWorkspaceMembers(workspaceId: String) async throws -> PlusApiResultListMemberVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces/\(workspaceId)/members"))
        return response as? PlusApiResultListMemberVO
    }

    /// 邀请成员
    public func inviteMember(workspaceId: String, body: MemberInviteForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/workspaces/\(workspaceId)/members"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取当前工作空间
    public func getCurrentWorkspace() async throws -> PlusApiResultWorkspaceVO? {
        let response = try await client.get(ApiPaths.appPath("/workspaces/current"))
        return response as? PlusApiResultWorkspaceVO
    }

    /// 移除成员
    public func removeMember(workspaceId: String, userId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/workspaces/\(workspaceId)/members/\(userId)"))
        return response as? PlusApiResultVoid
    }
}
