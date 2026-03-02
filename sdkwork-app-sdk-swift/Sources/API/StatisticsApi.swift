import Foundation

public class StatisticsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取组织统计
    public func getOrganization() async throws -> PlusApiResultOrganizationStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/statistics"))
        return response as? PlusApiResultOrganizationStatisticsVO
    }
}
