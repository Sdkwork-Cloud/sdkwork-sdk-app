import Foundation

public class AgentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get agent
    public func get(agentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// Update agent
    public func update(agentId: String, body: UpdateRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.put(ApiPaths.appPath("/agents/\(agentId)"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Delete agent
    public func delete(agentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/agents/\(agentId)"))
        return response as? PlusApiResultVoid
    }

    /// List agents
    public func list(params: [String: Any]? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents"), params: params)
        return response as? PlusApiResultMapStringObject
    }

    /// Create agent
    public func create(body: CreateRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// List sessions
    public func listSessions(agentId: String) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/sessions"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Create session
    public func createSession(agentId: String, body: CreateSessionRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/sessions"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Reset agent
    public func reset(agentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/agents/\(agentId)/reset"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// List session messages
    public func listSessionMessages(sessionId: String) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/sessions/\(sessionId)/messages"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Send session message
    public func sendSessionMessage(sessionId: String, body: SendSessionMessageRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/agents/sessions/\(sessionId)/messages"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Clear session
    public func clearSession(sessionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/agents/sessions/\(sessionId)/clear"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// Agent stats
    public func stats(agentId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/agents/\(agentId)/stats"))
        return response as? PlusApiResultMapStringObject
    }

    /// Delete session
    public func deleteSession(sessionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/agents/sessions/\(sessionId)"))
        return response as? PlusApiResultVoid
    }
}
