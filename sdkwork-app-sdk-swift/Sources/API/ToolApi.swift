import Foundation

public class ToolApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update tool credentials
    public func updateCredentials(toolId: String, body: UpdateCredentialsRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.put(ApiPaths.appPath("/tools/my/\(toolId)/credentials"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// List my tools
    public func listMine() async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/tools/my"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Install tool
    public func install(body: InstallRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/tools/my"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Test tool
    public func test(toolId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/tools/market/\(toolId)/test"), body: nil)
        return response as? PlusApiResultMapStringObject
    }

    /// List tool market
    public func listMarket(params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/tools/market"), params: params)
        return response as? PlusApiResultListMapStringObject
    }

    /// Get tool market item
    public func getMarketItem(toolId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/tools/market/\(toolId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// List tool categories
    public func listCategories() async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/tools/categories"))
        return response as? PlusApiResultListMapStringObject
    }

    /// Uninstall tool
    public func uninstall(toolId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/tools/my/\(toolId)"))
        return response as? PlusApiResultVoid
    }
}
