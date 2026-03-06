import Foundation

public class SkillApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get skill detail
    public func detail(skillId: String) async throws -> PlusApiResultSkillVO? {
        let response = try await client.get(ApiPaths.appPath("/skills/\(skillId)"))
        return response as? PlusApiResultSkillVO
    }

    /// Update skill
    public func update(skillId: String, body: SkillSaveForm) async throws -> PlusApiResultSkillVO? {
        let response = try await client.put(ApiPaths.appPath("/skills/\(skillId)"), body: body)
        return response as? PlusApiResultSkillVO
    }

    /// Update user skill config
    public func updateConfig(skillId: String, body: SkillConfigUpdateForm? = nil) async throws -> PlusApiResultUserSkillVO? {
        let response = try await client.put(ApiPaths.appPath("/skills/\(skillId)/config"), body: body)
        return response as? PlusApiResultUserSkillVO
    }

    /// List market skills
    public func list(params: [String: Any]? = nil) async throws -> PlusApiResultPageSkillVO? {
        let response = try await client.get(ApiPaths.appPath("/skills"), params: params)
        return response as? PlusApiResultPageSkillVO
    }

    /// Create skill
    public func create(body: SkillSaveForm) async throws -> PlusApiResultSkillVO? {
        let response = try await client.post(ApiPaths.appPath("/skills"), body: body)
        return response as? PlusApiResultSkillVO
    }

    /// Submit skill for review
    public func submitReview(skillId: String) async throws -> PlusApiResultSkillVO? {
        let response = try await client.post(ApiPaths.appPath("/skills/\(skillId)/submit-review"), body: nil)
        return response as? PlusApiResultSkillVO
    }

    /// Publish skill to market
    public func publish(skillId: String) async throws -> PlusApiResultSkillVO? {
        let response = try await client.post(ApiPaths.appPath("/skills/\(skillId)/publish"), body: nil)
        return response as? PlusApiResultSkillVO
    }

    /// Offline skill from market
    public func offline(skillId: String) async throws -> PlusApiResultSkillVO? {
        let response = try await client.post(ApiPaths.appPath("/skills/\(skillId)/offline"), body: nil)
        return response as? PlusApiResultSkillVO
    }

    /// Enable skill for current user
    public func enable(skillId: String) async throws -> PlusApiResultUserSkillVO? {
        let response = try await client.post(ApiPaths.appPath("/skills/\(skillId)/enable"), body: nil)
        return response as? PlusApiResultUserSkillVO
    }

    /// Disable skill for current user
    public func disable(skillId: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.appPath("/skills/\(skillId)/disable"), body: nil)
        return response as? PlusApiResultBoolean
    }

    /// List skill packages
    public func listPackages() async throws -> PlusApiResultListSkillPackageVO? {
        let response = try await client.get(ApiPaths.appPath("/skills/packages"))
        return response as? PlusApiResultListSkillPackageVO
    }

    /// List my installed skills
    public func listMine() async throws -> PlusApiResultListUserSkillVO? {
        let response = try await client.get(ApiPaths.appPath("/skills/my"))
        return response as? PlusApiResultListUserSkillVO
    }

    /// List skill categories
    public func listCategories() async throws -> PlusApiResultListSkillCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/skills/categories"))
        return response as? PlusApiResultListSkillCategoryVO
    }
}
