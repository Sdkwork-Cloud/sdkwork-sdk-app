import Foundation

public class AgentMemoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List memories
    public func list(agentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory"), params: params)
        return response as? PlusApiResultListMapStringObject
    }

    /// Create memory
    public func create(agentId: String, body: CreatePostRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/memory"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Summarize session
    public func summarizeSession(agentId: String, sessionId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/memory/sessions/\(sessionId)/summarize"), body: nil)
        return response as? PlusApiResultMapStringObject
    }

    /// List knowledge
    public func listKnowledge(agentId: String) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Create knowledge
    public func createKnowledge(agentId: String, body: CreateKnowledgeRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Consolidate memories
    public func consolidate(agentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/memory/consolidate"), body: nil)
        return response as? PlusApiResultMapStringObject
    }

    /// Memory stats
    public func stats(agentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/stats"))
        return response as? PlusApiResultMapStringObject
    }

    /// List session history
    public func listSessionHistory(agentId: String, sessionId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/sessions/\(sessionId)/history"), params: params)
        return response as? PlusApiResultListMapStringObject
    }

    /// Search memories
    public func search(agentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/search"), params: params)
        return response as? PlusApiResultListMapStringObject
    }

    /// Get knowledge
    public func getKnowledge(agentId: String, documentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge/\(documentId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// Delete knowledge
    public func deleteKnowledge(agentId: String, documentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.delete(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge/\(documentId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// List knowledge chunks
    public func listKnowledgeChunks(agentId: String, documentId: String) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge/\(documentId)/chunks"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Knowledge stats
    public func knowledgeStats(agentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge/stats"))
        return response as? PlusApiResultMapStringObject
    }

    /// Search knowledge
    public func searchKnowledge(agentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/memory/knowledge/search"), params: params)
        return response as? PlusApiResultListMapStringObject
    }

    /// Delete memory
    public func delete(agentId: String, memoryId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.delete(ApiPaths.appPath("/agents/\(agentId)/memory/\(memoryId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// Clear session memories
    public func clearSession(agentId: String, sessionId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.delete(ApiPaths.appPath("/agents/\(agentId)/memory/sessions/\(sessionId)"))
        return response as? PlusApiResultMapStringObject
    }
}
